package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

/**
 * @author Ruben Bermudez
 * @version 1.0
 * @brief This object represents a point on the map.
 * @date 20 of June of 2015
 */
public class Location implements BotApiObject {

    private static final String LONGITUDE_FIELD = "longitude";
    private static final String LATITUDE_FIELD = "latitude";

    @JsonProperty(LONGITUDE_FIELD)
    private Float longitude; ///< Longitude as defined by sender
    @JsonProperty(LATITUDE_FIELD)
    private Float latitude; ///< Latitude as defined by sender

    public Location() {
        super();
    }

    public Float getLongitude() {
        return longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
