package com.example.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a POJO.
 * @author Kaushal
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

	private Double id;
	private String main;
	private String description;
	private String icon;

	@JsonCreator
	public Weather(@JsonProperty("id") Double id,
			@JsonProperty("main") String main,
			@JsonProperty("description") String description,
			@JsonProperty("icon") String icon) {

		this.id = id;
		this.main = main;
		this.description = description;
		this.icon = icon;
	}

	public Weather() {

	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
