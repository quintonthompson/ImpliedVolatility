
package com.thompson.OptionsImpliedVolatility.data;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expirationDate",
    "hasMiniOptions",
    "calls",
    "puts"
})
public class Option {

    @JsonProperty("expirationDate")
    private Long expirationDate;
    @JsonProperty("hasMiniOptions")
    private Boolean hasMiniOptions;
    @JsonProperty("calls")
    private List<Call> calls = null;
    @JsonProperty("puts")
    private List<Put> puts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("expirationDate")
    public Long getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expirationDate")
    public void setExpirationDate(Long expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("hasMiniOptions")
    public Boolean getHasMiniOptions() {
        return hasMiniOptions;
    }

    @JsonProperty("hasMiniOptions")
    public void setHasMiniOptions(Boolean hasMiniOptions) {
        this.hasMiniOptions = hasMiniOptions;
    }

    @JsonProperty("calls")
    public List<Call> getCalls() {
        return calls;
    }

    @JsonProperty("calls")
    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }

    @JsonProperty("puts")
    public List<Put> getPuts() {
        return puts;
    }

    @JsonProperty("puts")
    public void setPuts(List<Put> puts) {
        this.puts = puts;
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
