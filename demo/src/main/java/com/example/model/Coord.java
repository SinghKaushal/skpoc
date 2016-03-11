package com.example.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This a POJO
 * @author Kaushal
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord {

	private Double lon;
	private Double lat;
	
   @JsonCreator	
   public Coord(@JsonProperty("lon") Double lon, @JsonProperty("lat") Double lat){
		
		this.lon=lon;
		this.lat=lat;
	}
   public Coord(){
	   
   }
	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}	
}
