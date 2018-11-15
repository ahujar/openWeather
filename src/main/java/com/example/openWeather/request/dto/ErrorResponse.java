package com.example.openWeather.request.dto;

import com.fasterxml.jackson.annotation.*;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cod",
        "message"
})
public class ErrorResponse {

    @JsonProperty("cod")
    private Integer cod;
    @JsonProperty("message")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cod")
    public Integer getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(Integer cod) {
        this.cod = cod;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "cod=" + cod +
                ", message='" + message + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    public String toJsonString(){
        return new JSONObject().put("cod",cod).put("message",message).toString();

    }

}
