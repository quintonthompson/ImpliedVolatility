
package com.thompson.OptionsImpliedVolatility.data;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contractSymbol",
    "strike",
    "currency",
    "lastPrice",
    "change",
    "percentChange",
    "volume",
    "openInterest",
    "bid",
    "ask",
    "contractSize",
    "expiration",
    "lastTradeDate",
    "impliedVolatility",
    "inTheMoney"
})
public class Put {

    @JsonProperty("contractSymbol")
    private String contractSymbol;
    @JsonProperty("strike")
    private Integer strike;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("lastPrice")
    private Double lastPrice;
    @JsonProperty("change")
    private Float change;
    @JsonProperty("percentChange")
    private Float percentChange;
    @JsonProperty("volume")
    private Long volume;
    @JsonProperty("openInterest")
    private Integer openInterest;
    @JsonProperty("bid")
    private Double bid;
    @JsonProperty("ask")
    private Double ask;
    @JsonProperty("contractSize")
    private String contractSize;
    @JsonProperty("expiration")
    private Long expiration;
    @JsonProperty("lastTradeDate")
    private Long lastTradeDate;
    @JsonProperty("impliedVolatility")
    private Float impliedVolatility;
    @JsonProperty("inTheMoney")
    private Boolean inTheMoney;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contractSymbol")
    public String getContractSymbol() {
        return contractSymbol;
    }

    @JsonProperty("contractSymbol")
    public void setContractSymbol(String contractSymbol) {
        this.contractSymbol = contractSymbol;
    }

    @JsonProperty("strike")
    public Integer getStrike() {
        return strike;
    }

    @JsonProperty("strike")
    public void setStrike(Integer strike) {
        this.strike = strike;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("lastPrice")
    public Double getLastPrice() {
        return lastPrice;
    }

    @JsonProperty("lastPrice")
    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    @JsonProperty("change")
    public Float getChange() {
        return change;
    }

    @JsonProperty("change")
    public void setChange(Float change) {
        this.change = change;
    }

    @JsonProperty("percentChange")
    public Float getPercentChange() {
        return percentChange;
    }

    @JsonProperty("percentChange")
    public void setPercentChange(Float percentChange) {
        this.percentChange = percentChange;
    }

    @JsonProperty("volume")
    public Long getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(Long volume) {
        this.volume = volume;
    }

    @JsonProperty("openInterest")
    public Integer getOpenInterest() {
        return openInterest;
    }

    @JsonProperty("openInterest")
    public void setOpenInterest(Integer openInterest) {
        this.openInterest = openInterest;
    }

    @JsonProperty("bid")
    public Double getBid() {
        return bid;
    }

    @JsonProperty("bid")
    public void setBid(Double bid) {
        this.bid = bid;
    }

    @JsonProperty("ask")
    public Double getAsk() {
        return ask;
    }

    @JsonProperty("ask")
    public void setAsk(Double ask) {
        this.ask = ask;
    }

    @JsonProperty("contractSize")
    public String getContractSize() {
        return contractSize;
    }

    @JsonProperty("contractSize")
    public void setContractSize(String contractSize) {
        this.contractSize = contractSize;
    }

    @JsonProperty("expiration")
    public Long getExpiration() {
        return expiration;
    }

    @JsonProperty("expiration")
    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }

    @JsonProperty("lastTradeDate")
    public Long getLastTradeDate() {
        return lastTradeDate;
    }

    @JsonProperty("lastTradeDate")
    public void setLastTradeDate(Long lastTradeDate) {
        this.lastTradeDate = lastTradeDate;
    }

    @JsonProperty("impliedVolatility")
    public Float getImpliedVolatility() {
        return impliedVolatility;
    }

    @JsonProperty("impliedVolatility")
    public void setImpliedVolatility(Float impliedVolatility) {
        this.impliedVolatility = impliedVolatility;
    }

    @JsonProperty("inTheMoney")
    public Boolean getInTheMoney() {
        return inTheMoney;
    }

    @JsonProperty("inTheMoney")
    public void setInTheMoney(Boolean inTheMoney) {
        this.inTheMoney = inTheMoney;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
