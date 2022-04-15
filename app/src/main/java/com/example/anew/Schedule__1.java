
package com.example.anew;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "desktop_url",
    "touch_url"
})
@Generated("jsonschema2pojo")
public class Schedule__1 {

    @JsonProperty("desktop_url")
    private String desktopUrl;
    @JsonProperty("touch_url")
    private String touchUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("desktop_url")
    public String getDesktopUrl() {
        return desktopUrl;
    }

    @JsonProperty("desktop_url")
    public void setDesktopUrl(String desktopUrl) {
        this.desktopUrl = desktopUrl;
    }

    @JsonProperty("touch_url")
    public String getTouchUrl() {
        return touchUrl;
    }

    @JsonProperty("touch_url")
    public void setTouchUrl(String touchUrl) {
        this.touchUrl = touchUrl;
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
