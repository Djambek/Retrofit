
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
    "distance",
    "code",
    "station_type",
    "type_choices",
    "title",
    "popular_title",
    "short_title",
    "majority",
    "transport_type",
    "lat",
    "lng",
    "type",
    "station_type_name"
})
@Generated("jsonschema2pojo")
public class Station {

    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("code")
    private String code;
    @JsonProperty("station_type")
    private String stationType;
    @JsonProperty("type_choices")
    private TypeChoices typeChoices;
    @JsonProperty("title")
    private String title;
    @JsonProperty("popular_title")
    private Object popularTitle;
    @JsonProperty("short_title")
    private Object shortTitle;
    @JsonProperty("majority")
    private Integer majority;
    @JsonProperty("transport_type")
    private String transportType;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("type")
    private String type;
    @JsonProperty("station_type_name")
    private String stationTypeName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("station_type")
    public String getStationType() {
        return stationType;
    }

    @JsonProperty("station_type")
    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    @JsonProperty("type_choices")
    public TypeChoices getTypeChoices() {
        return typeChoices;
    }

    @JsonProperty("type_choices")
    public void setTypeChoices(TypeChoices typeChoices) {
        this.typeChoices = typeChoices;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("popular_title")
    public Object getPopularTitle() {
        return popularTitle;
    }

    @JsonProperty("popular_title")
    public void setPopularTitle(Object popularTitle) {
        this.popularTitle = popularTitle;
    }

    @JsonProperty("short_title")
    public Object getShortTitle() {
        return shortTitle;
    }

    @JsonProperty("short_title")
    public void setShortTitle(Object shortTitle) {
        this.shortTitle = shortTitle;
    }

    @JsonProperty("majority")
    public Integer getMajority() {
        return majority;
    }

    @JsonProperty("majority")
    public void setMajority(Integer majority) {
        this.majority = majority;
    }

    @JsonProperty("transport_type")
    public String getTransportType() {
        return transportType;
    }

    @JsonProperty("transport_type")
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("station_type_name")
    public String getStationTypeName() {
        return stationTypeName;
    }

    @JsonProperty("station_type_name")
    public void setStationTypeName(String stationTypeName) {
        this.stationTypeName = stationTypeName;
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
