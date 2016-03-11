package com.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This is a POJO 
 * @author Kaushal
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherReport {
	
	private Coord coord;
	private String name;
	private List<Weather> weather;
	
	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	@JsonCreator
    public WeatherReport(@JsonProperty("coord") Coord coord, @JsonProperty("name")String name, @JsonProperty("weather")List<Weather> weather){
		
		this.coord=coord;
		this.name=name;
		this.weather=weather;
	}

	public WeatherReport() {
    }
    
	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
