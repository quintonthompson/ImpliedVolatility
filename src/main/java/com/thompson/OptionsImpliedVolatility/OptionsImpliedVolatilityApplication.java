package com.thompson.OptionsImpliedVolatility;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thompson.OptionsImpliedVolatility.data.Call;
import com.thompson.OptionsImpliedVolatility.data.Option;
import com.thompson.OptionsImpliedVolatility.data.Put;
import com.thompson.OptionsImpliedVolatility.data.Result;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

/*
This spring boot application uses web services to consume rest api in the json format.
The json is mapped to an option java object with the jackson mapping api.
Through the data collected I can calculate the implied volatility of the option.
 */

@SpringBootApplication
public class OptionsImpliedVolatilityApplication implements CommandLineRunner {

	private double otmCall;
	private double atmCall;
	private double otmPut;
	private double atmPut;
	private double sharePrice;

	public static void main(String[] args) {
		SpringApplication.run(OptionsImpliedVolatilityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		String resourceURL = "https://query2.finance.yahoo.com/v7/finance/options/goos";
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<String> response  = restTemplate.exchange(resourceURL, HttpMethod.GET,entity, String.class);
		ObjectMapper mapper = new ObjectMapper();

		JsonNode jsonNode = mapper.readTree(response.getBody());
		JsonNode resultNode = jsonNode.get("optionChain")
				.get("result").get(0);

		Result result = mapper.treeToValue(resultNode, Result.class);

		JsonNode optionNode = resultNode.get("options").get(0);
		Option option = mapper.treeToValue(optionNode,Option.class);

		calculateImpliedVotality(result,option);

	}

	public double calculateImpliedVotality(Result result, Option option){
		List<Call> calls = option.getCalls();
		sharePrice = result.getQuote().getRegularMarketPrice();
		double diff;
		for(int i = 0; i < calls.size(); i++){
			diff = sharePrice - calls.get(i).getStrike();
			if(diff < 0){
				atmCall = calls.get(i-1).getLastPrice();
				otmCall = calls.get(i).getLastPrice();
				break;
			}
			if(i == calls.size()-1){
				atmCall = calls.get(i).getLastPrice();
			}
		}

		List<Put> puts = option.getPuts();
		for(int i = puts.size()-1; i >= 0; i--){
			diff = sharePrice - puts.get(i).getStrike();
			if(diff > 0){
				atmPut = puts.get(i).getLastPrice();
				otmPut = puts.get(i-1).getLastPrice();
				break;
			}
			if(i == 0){
				atmPut = puts.get(i).getLastPrice();
			}
		}
		System.out.println("share price = " + sharePrice);

		System.out.println("atmCall = " + atmCall);
		System.out.println("otmCall = " + otmCall);

		System.out.println("atmPut = " + atmPut);
		System.out.println("otmPut = " + otmPut);

		Double impliedVolatility = (((atmCall + otmCall)/2)+((atmPut + otmPut)/2))/sharePrice;

		System.out.println("Implied volatility = " + impliedVolatility);

		return  impliedVolatility;
	}




}

