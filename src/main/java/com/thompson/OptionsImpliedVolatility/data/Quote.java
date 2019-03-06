
package com.thompson.OptionsImpliedVolatility.data;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "region",
    "quoteType",
    "quoteSourceName",
    "currency",
    "market",
    "marketState",
    "sharesOutstanding",
    "bookValue",
    "fiftyDayAverage",
    "fiftyDayAverageChange",
    "fiftyDayAverageChangePercent",
    "twoHundredDayAverage",
    "twoHundredDayAverageChange",
    "twoHundredDayAverageChangePercent",
    "marketCap",
    "forwardPE",
    "priceToBook",
    "sourceInterval",
    "exchangeTimezoneName",
    "shortName",
    "exchangeDataDelayedBy",
    "priceHint",
    "regularMarketChangePercent",
    "regularMarketDayRange",
    "regularMarketPreviousClose",
    "bid",
    "ask",
    "bidSize",
    "askSize",
    "messageBoardId",
    "fullExchangeName",
    "longName",
    "financialCurrency",
    "averageDailyVolume3Month",
    "averageDailyVolume10Day",
    "fiftyTwoWeekLowChange",
    "fiftyTwoWeekLowChangePercent",
    "fiftyTwoWeekRange",
    "fiftyTwoWeekHighChange",
    "fiftyTwoWeekHighChangePercent",
    "fiftyTwoWeekLow",
    "fiftyTwoWeekHigh",
    "dividendDate",
    "epsForward",
    "exchangeTimezoneShortName",
    "earningsTimestamp",
    "earningsTimestampStart",
    "earningsTimestampEnd",
    "trailingAnnualDividendRate",
    "trailingPE",
    "trailingAnnualDividendYield",
    "epsTrailingTwelveMonths",
    "gmtOffSetMilliseconds",
    "esgPopulated",
    "tradeable",
    "regularMarketPrice",
    "regularMarketTime",
    "regularMarketChange",
    "regularMarketOpen",
    "regularMarketDayHigh",
    "regularMarketDayLow",
    "regularMarketVolume",
    "exchange",
    "symbol"
})
public class Quote {

    @JsonProperty("language")
    private String language;
    @JsonProperty("region")
    private String region;
    @JsonProperty("quoteType")
    private String quoteType;
    @JsonProperty("quoteSourceName")
    private String quoteSourceName;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("market")
    private String market;
    @JsonProperty("marketState")
    private String marketState;
    @JsonProperty("sharesOutstanding")
    private Long sharesOutstanding;
    @JsonProperty("bookValue")
    private Double bookValue;
    @JsonProperty("fiftyDayAverage")
    private Float fiftyDayAverage;
    @JsonProperty("fiftyDayAverageChange")
    private Float fiftyDayAverageChange;
    @JsonProperty("fiftyDayAverageChangePercent")
    private Float fiftyDayAverageChangePercent;
    @JsonProperty("twoHundredDayAverage")
    private Float twoHundredDayAverage;
    @JsonProperty("twoHundredDayAverageChange")
    private Float twoHundredDayAverageChange;
    @JsonProperty("twoHundredDayAverageChangePercent")
    private Float twoHundredDayAverageChangePercent;
    @JsonProperty("marketCap")
    private Long marketCap;
    @JsonProperty("forwardPE")
    private Float forwardPE;
    @JsonProperty("priceToBook")
    private Float priceToBook;
    @JsonProperty("sourceInterval")
    private Integer sourceInterval;
    @JsonProperty("exchangeTimezoneName")
    private String exchangeTimezoneName;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("exchangeDataDelayedBy")
    private Integer exchangeDataDelayedBy;
    @JsonProperty("priceHint")
    private Integer priceHint;
    @JsonProperty("regularMarketChangePercent")
    private Float regularMarketChangePercent;
    @JsonProperty("regularMarketDayRange")
    private String regularMarketDayRange;
    @JsonProperty("regularMarketPreviousClose")
    private Double regularMarketPreviousClose;
    @JsonProperty("bid")
    private Double bid;
    @JsonProperty("ask")
    private Double ask;
    @JsonProperty("bidSize")
    private Integer bidSize;
    @JsonProperty("askSize")
    private Integer askSize;
    @JsonProperty("messageBoardId")
    private String messageBoardId;
    @JsonProperty("fullExchangeName")
    private String fullExchangeName;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("financialCurrency")
    private String financialCurrency;
    @JsonProperty("averageDailyVolume3Month")
    private Long averageDailyVolume3Month;
    @JsonProperty("averageDailyVolume10Day")
    private Long averageDailyVolume10Day;
    @JsonProperty("fiftyTwoWeekLowChange")
    private Float fiftyTwoWeekLowChange;
    @JsonProperty("fiftyTwoWeekLowChangePercent")
    private Float fiftyTwoWeekLowChangePercent;
    @JsonProperty("fiftyTwoWeekRange")
    private String fiftyTwoWeekRange;
    @JsonProperty("fiftyTwoWeekHighChange")
    private Float fiftyTwoWeekHighChange;
    @JsonProperty("fiftyTwoWeekHighChangePercent")
    private Float fiftyTwoWeekHighChangePercent;
    @JsonProperty("fiftyTwoWeekLow")
    private Double fiftyTwoWeekLow;
    @JsonProperty("fiftyTwoWeekHigh")
    private Double fiftyTwoWeekHigh;
    @JsonProperty("dividendDate")
    private Long dividendDate;
    @JsonProperty("epsForward")
    private Double epsForward;
    @JsonProperty("exchangeTimezoneShortName")
    private String exchangeTimezoneShortName;
    @JsonProperty("earningsTimestamp")
    private Long earningsTimestamp;
    @JsonProperty("earningsTimestampStart")
    private Long earningsTimestampStart;
    @JsonProperty("earningsTimestampEnd")
    private Long earningsTimestampEnd;
    @JsonProperty("trailingAnnualDividendRate")
    private Double trailingAnnualDividendRate;
    @JsonProperty("trailingPE")
    private Float trailingPE;
    @JsonProperty("trailingAnnualDividendYield")
    private Float trailingAnnualDividendYield;
    @JsonProperty("epsTrailingTwelveMonths")
    private Float epsTrailingTwelveMonths;
    @JsonProperty("gmtOffSetMilliseconds")
    private Long gmtOffSetMilliseconds;
    @JsonProperty("esgPopulated")
    private Boolean esgPopulated;
    @JsonProperty("tradeable")
    private Boolean tradeable;
    @JsonProperty("regularMarketPrice")
    private Float regularMarketPrice;
    @JsonProperty("regularMarketTime")
    private Long regularMarketTime;
    @JsonProperty("regularMarketChange")
    private Float regularMarketChange;
    @JsonProperty("regularMarketOpen")
    private Double regularMarketOpen;
    @JsonProperty("regularMarketDayHigh")
    private Double regularMarketDayHigh;
    @JsonProperty("regularMarketDayLow")
    private Double regularMarketDayLow;
    @JsonProperty("regularMarketVolume")
    private Long regularMarketVolume;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("symbol")
    private String symbol;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("quoteType")
    public String getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("quoteSourceName")
    public String getQuoteSourceName() {
        return quoteSourceName;
    }

    @JsonProperty("quoteSourceName")
    public void setQuoteSourceName(String quoteSourceName) {
        this.quoteSourceName = quoteSourceName;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("market")
    public String getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(String market) {
        this.market = market;
    }

    @JsonProperty("marketState")
    public String getMarketState() {
        return marketState;
    }

    @JsonProperty("marketState")
    public void setMarketState(String marketState) {
        this.marketState = marketState;
    }

    @JsonProperty("sharesOutstanding")
    public Long getSharesOutstanding() {
        return sharesOutstanding;
    }

    @JsonProperty("sharesOutstanding")
    public void setSharesOutstanding(Long sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    @JsonProperty("bookValue")
    public Double getBookValue() {
        return bookValue;
    }

    @JsonProperty("bookValue")
    public void setBookValue(Double bookValue) {
        this.bookValue = bookValue;
    }

    @JsonProperty("fiftyDayAverage")
    public Float getFiftyDayAverage() {
        return fiftyDayAverage;
    }

    @JsonProperty("fiftyDayAverage")
    public void setFiftyDayAverage(Float fiftyDayAverage) {
        this.fiftyDayAverage = fiftyDayAverage;
    }

    @JsonProperty("fiftyDayAverageChange")
    public Float getFiftyDayAverageChange() {
        return fiftyDayAverageChange;
    }

    @JsonProperty("fiftyDayAverageChange")
    public void setFiftyDayAverageChange(Float fiftyDayAverageChange) {
        this.fiftyDayAverageChange = fiftyDayAverageChange;
    }

    @JsonProperty("fiftyDayAverageChangePercent")
    public Float getFiftyDayAverageChangePercent() {
        return fiftyDayAverageChangePercent;
    }

    @JsonProperty("fiftyDayAverageChangePercent")
    public void setFiftyDayAverageChangePercent(Float fiftyDayAverageChangePercent) {
        this.fiftyDayAverageChangePercent = fiftyDayAverageChangePercent;
    }

    @JsonProperty("twoHundredDayAverage")
    public Float getTwoHundredDayAverage() {
        return twoHundredDayAverage;
    }

    @JsonProperty("twoHundredDayAverage")
    public void setTwoHundredDayAverage(Float twoHundredDayAverage) {
        this.twoHundredDayAverage = twoHundredDayAverage;
    }

    @JsonProperty("twoHundredDayAverageChange")
    public Float getTwoHundredDayAverageChange() {
        return twoHundredDayAverageChange;
    }

    @JsonProperty("twoHundredDayAverageChange")
    public void setTwoHundredDayAverageChange(Float twoHundredDayAverageChange) {
        this.twoHundredDayAverageChange = twoHundredDayAverageChange;
    }

    @JsonProperty("twoHundredDayAverageChangePercent")
    public Float getTwoHundredDayAverageChangePercent() {
        return twoHundredDayAverageChangePercent;
    }

    @JsonProperty("twoHundredDayAverageChangePercent")
    public void setTwoHundredDayAverageChangePercent(Float twoHundredDayAverageChangePercent) {
        this.twoHundredDayAverageChangePercent = twoHundredDayAverageChangePercent;
    }

    @JsonProperty("marketCap")
    public Long getMarketCap() {
        return marketCap;
    }

    @JsonProperty("marketCap")
    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("forwardPE")
    public Float getForwardPE() {
        return forwardPE;
    }

    @JsonProperty("forwardPE")
    public void setForwardPE(Float forwardPE) {
        this.forwardPE = forwardPE;
    }

    @JsonProperty("priceToBook")
    public Float getPriceToBook() {
        return priceToBook;
    }

    @JsonProperty("priceToBook")
    public void setPriceToBook(Float priceToBook) {
        this.priceToBook = priceToBook;
    }

    @JsonProperty("sourceInterval")
    public Integer getSourceInterval() {
        return sourceInterval;
    }

    @JsonProperty("sourceInterval")
    public void setSourceInterval(Integer sourceInterval) {
        this.sourceInterval = sourceInterval;
    }

    @JsonProperty("exchangeTimezoneName")
    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    @JsonProperty("exchangeTimezoneName")
    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public Integer getExchangeDataDelayedBy() {
        return exchangeDataDelayedBy;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public void setExchangeDataDelayedBy(Integer exchangeDataDelayedBy) {
        this.exchangeDataDelayedBy = exchangeDataDelayedBy;
    }

    @JsonProperty("priceHint")
    public Integer getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(Integer priceHint) {
        this.priceHint = priceHint;
    }

    @JsonProperty("regularMarketChangePercent")
    public Float getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    @JsonProperty("regularMarketChangePercent")
    public void setRegularMarketChangePercent(Float regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    @JsonProperty("regularMarketDayRange")
    public String getRegularMarketDayRange() {
        return regularMarketDayRange;
    }

    @JsonProperty("regularMarketDayRange")
    public void setRegularMarketDayRange(String regularMarketDayRange) {
        this.regularMarketDayRange = regularMarketDayRange;
    }

    @JsonProperty("regularMarketPreviousClose")
    public Double getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    @JsonProperty("regularMarketPreviousClose")
    public void setRegularMarketPreviousClose(Double regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
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

    @JsonProperty("bidSize")
    public Integer getBidSize() {
        return bidSize;
    }

    @JsonProperty("bidSize")
    public void setBidSize(Integer bidSize) {
        this.bidSize = bidSize;
    }

    @JsonProperty("askSize")
    public Integer getAskSize() {
        return askSize;
    }

    @JsonProperty("askSize")
    public void setAskSize(Integer askSize) {
        this.askSize = askSize;
    }

    @JsonProperty("messageBoardId")
    public String getMessageBoardId() {
        return messageBoardId;
    }

    @JsonProperty("messageBoardId")
    public void setMessageBoardId(String messageBoardId) {
        this.messageBoardId = messageBoardId;
    }

    @JsonProperty("fullExchangeName")
    public String getFullExchangeName() {
        return fullExchangeName;
    }

    @JsonProperty("fullExchangeName")
    public void setFullExchangeName(String fullExchangeName) {
        this.fullExchangeName = fullExchangeName;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @JsonProperty("financialCurrency")
    public String getFinancialCurrency() {
        return financialCurrency;
    }

    @JsonProperty("financialCurrency")
    public void setFinancialCurrency(String financialCurrency) {
        this.financialCurrency = financialCurrency;
    }

    @JsonProperty("averageDailyVolume3Month")
    public Long getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    @JsonProperty("averageDailyVolume3Month")
    public void setAverageDailyVolume3Month(Long averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
    }

    @JsonProperty("averageDailyVolume10Day")
    public Long getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    @JsonProperty("averageDailyVolume10Day")
    public void setAverageDailyVolume10Day(Long averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    @JsonProperty("fiftyTwoWeekLowChange")
    public Float getFiftyTwoWeekLowChange() {
        return fiftyTwoWeekLowChange;
    }

    @JsonProperty("fiftyTwoWeekLowChange")
    public void setFiftyTwoWeekLowChange(Float fiftyTwoWeekLowChange) {
        this.fiftyTwoWeekLowChange = fiftyTwoWeekLowChange;
    }

    @JsonProperty("fiftyTwoWeekLowChangePercent")
    public Float getFiftyTwoWeekLowChangePercent() {
        return fiftyTwoWeekLowChangePercent;
    }

    @JsonProperty("fiftyTwoWeekLowChangePercent")
    public void setFiftyTwoWeekLowChangePercent(Float fiftyTwoWeekLowChangePercent) {
        this.fiftyTwoWeekLowChangePercent = fiftyTwoWeekLowChangePercent;
    }

    @JsonProperty("fiftyTwoWeekRange")
    public String getFiftyTwoWeekRange() {
        return fiftyTwoWeekRange;
    }

    @JsonProperty("fiftyTwoWeekRange")
    public void setFiftyTwoWeekRange(String fiftyTwoWeekRange) {
        this.fiftyTwoWeekRange = fiftyTwoWeekRange;
    }

    @JsonProperty("fiftyTwoWeekHighChange")
    public Float getFiftyTwoWeekHighChange() {
        return fiftyTwoWeekHighChange;
    }

    @JsonProperty("fiftyTwoWeekHighChange")
    public void setFiftyTwoWeekHighChange(Float fiftyTwoWeekHighChange) {
        this.fiftyTwoWeekHighChange = fiftyTwoWeekHighChange;
    }

    @JsonProperty("fiftyTwoWeekHighChangePercent")
    public Float getFiftyTwoWeekHighChangePercent() {
        return fiftyTwoWeekHighChangePercent;
    }

    @JsonProperty("fiftyTwoWeekHighChangePercent")
    public void setFiftyTwoWeekHighChangePercent(Float fiftyTwoWeekHighChangePercent) {
        this.fiftyTwoWeekHighChangePercent = fiftyTwoWeekHighChangePercent;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public Double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public Double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    @JsonProperty("dividendDate")
    public Long getDividendDate() {
        return dividendDate;
    }

    @JsonProperty("dividendDate")
    public void setDividendDate(Long dividendDate) {
        this.dividendDate = dividendDate;
    }

    @JsonProperty("epsForward")
    public Double getEpsForward() {
        return epsForward;
    }

    @JsonProperty("epsForward")
    public void setEpsForward(Double epsForward) {
        this.epsForward = epsForward;
    }

    @JsonProperty("exchangeTimezoneShortName")
    public String getExchangeTimezoneShortName() {
        return exchangeTimezoneShortName;
    }

    @JsonProperty("exchangeTimezoneShortName")
    public void setExchangeTimezoneShortName(String exchangeTimezoneShortName) {
        this.exchangeTimezoneShortName = exchangeTimezoneShortName;
    }

    @JsonProperty("earningsTimestamp")
    public Long getEarningsTimestamp() {
        return earningsTimestamp;
    }

    @JsonProperty("earningsTimestamp")
    public void setEarningsTimestamp(Long earningsTimestamp) {
        this.earningsTimestamp = earningsTimestamp;
    }

    @JsonProperty("earningsTimestampStart")
    public Long getEarningsTimestampStart() {
        return earningsTimestampStart;
    }

    @JsonProperty("earningsTimestampStart")
    public void setEarningsTimestampStart(Long earningsTimestampStart) {
        this.earningsTimestampStart = earningsTimestampStart;
    }

    @JsonProperty("earningsTimestampEnd")
    public Long getEarningsTimestampEnd() {
        return earningsTimestampEnd;
    }

    @JsonProperty("earningsTimestampEnd")
    public void setEarningsTimestampEnd(Long earningsTimestampEnd) {
        this.earningsTimestampEnd = earningsTimestampEnd;
    }

    @JsonProperty("trailingAnnualDividendRate")
    public Double getTrailingAnnualDividendRate() {
        return trailingAnnualDividendRate;
    }

    @JsonProperty("trailingAnnualDividendRate")
    public void setTrailingAnnualDividendRate(Double trailingAnnualDividendRate) {
        this.trailingAnnualDividendRate = trailingAnnualDividendRate;
    }

    @JsonProperty("trailingPE")
    public Float getTrailingPE() {
        return trailingPE;
    }

    @JsonProperty("trailingPE")
    public void setTrailingPE(Float trailingPE) {
        this.trailingPE = trailingPE;
    }

    @JsonProperty("trailingAnnualDividendYield")
    public Float getTrailingAnnualDividendYield() {
        return trailingAnnualDividendYield;
    }

    @JsonProperty("trailingAnnualDividendYield")
    public void setTrailingAnnualDividendYield(Float trailingAnnualDividendYield) {
        this.trailingAnnualDividendYield = trailingAnnualDividendYield;
    }

    @JsonProperty("epsTrailingTwelveMonths")
    public Float getEpsTrailingTwelveMonths() {
        return epsTrailingTwelveMonths;
    }

    @JsonProperty("epsTrailingTwelveMonths")
    public void setEpsTrailingTwelveMonths(Float epsTrailingTwelveMonths) {
        this.epsTrailingTwelveMonths = epsTrailingTwelveMonths;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public Long getGmtOffSetMilliseconds() {
        return gmtOffSetMilliseconds;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public void setGmtOffSetMilliseconds(Long gmtOffSetMilliseconds) {
        this.gmtOffSetMilliseconds = gmtOffSetMilliseconds;
    }

    @JsonProperty("esgPopulated")
    public Boolean getEsgPopulated() {
        return esgPopulated;
    }

    @JsonProperty("esgPopulated")
    public void setEsgPopulated(Boolean esgPopulated) {
        this.esgPopulated = esgPopulated;
    }

    @JsonProperty("tradeable")
    public Boolean getTradeable() {
        return tradeable;
    }

    @JsonProperty("tradeable")
    public void setTradeable(Boolean tradeable) {
        this.tradeable = tradeable;
    }

    @JsonProperty("regularMarketPrice")
    public Float getRegularMarketPrice() {
        return regularMarketPrice;
    }

    @JsonProperty("regularMarketPrice")
    public void setRegularMarketPrice(Float regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    @JsonProperty("regularMarketTime")
    public Long getRegularMarketTime() {
        return regularMarketTime;
    }

    @JsonProperty("regularMarketTime")
    public void setRegularMarketTime(Long regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    @JsonProperty("regularMarketChange")
    public Float getRegularMarketChange() {
        return regularMarketChange;
    }

    @JsonProperty("regularMarketChange")
    public void setRegularMarketChange(Float regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    @JsonProperty("regularMarketOpen")
    public Double getRegularMarketOpen() {
        return regularMarketOpen;
    }

    @JsonProperty("regularMarketOpen")
    public void setRegularMarketOpen(Double regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    @JsonProperty("regularMarketDayHigh")
    public Double getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayHigh")
    public void setRegularMarketDayHigh(Double regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayLow")
    public Double getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    @JsonProperty("regularMarketDayLow")
    public void setRegularMarketDayLow(Double regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    @JsonProperty("regularMarketVolume")
    public Long getRegularMarketVolume() {
        return regularMarketVolume;
    }

    @JsonProperty("regularMarketVolume")
    public void setRegularMarketVolume(Long regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
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
