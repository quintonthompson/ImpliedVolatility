
package com.thompson.OptionsImpliedVolatility.data;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "underlyingSymbol",
    "expirationDates",
    "strikes",
    "hasMiniOptions",
    "quote",
    "options"
})
public class Result {

    @JsonProperty("underlyingSymbol")
    private String underlyingSymbol;
    @JsonProperty("expirationDates")
    private List<Integer> expirationDates = null;
    @JsonProperty("strikes")
    private List<Integer> strikes = null;
    @JsonProperty("hasMiniOptions")
    private Boolean hasMiniOptions;
    @JsonProperty("quote")
    private Quote quote;
    @JsonProperty("options")
    private List<Option> options = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("underlyingSymbol")
    public String getUnderlyingSymbol() {
        return underlyingSymbol;
    }

    @JsonProperty("underlyingSymbol")
    public void setUnderlyingSymbol(String underlyingSymbol) {
        this.underlyingSymbol = underlyingSymbol;
    }

    @JsonProperty("expirationDates")
    public List<Integer> getExpirationDates() {
        return expirationDates;
    }

    @JsonProperty("expirationDates")
    public void setExpirationDates(List<Integer> expirationDates) {
        this.expirationDates = expirationDates;
    }

    @JsonProperty("strikes")
    public List<Integer> getStrikes() {
        return strikes;
    }

    @JsonProperty("strikes")
    public void setStrikes(List<Integer> strikes) {
        this.strikes = strikes;
    }

    @JsonProperty("hasMiniOptions")
    public Boolean getHasMiniOptions() {
        return hasMiniOptions;
    }

    @JsonProperty("hasMiniOptions")
    public void setHasMiniOptions(Boolean hasMiniOptions) {
        this.hasMiniOptions = hasMiniOptions;
    }

    @JsonProperty("quote")
    public Quote getQuote() {
        return quote;
    }

    @JsonProperty("quote")
    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
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
