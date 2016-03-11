package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This is POJO 
 * @author Kaushal
 *
 */
@Document(collection="Brand")
public class Brand {

	@Id
	private String id;
	
	private String item;
	private String model;
	private String country;

	public Brand(){}
	
	public Brand(String item, String model, String country){
		
		this.item=item;
		this.model=model;
		this.country=country;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString(){
		
		return String.format("Brand[id=%s, item='%s', model='%s', country='%s']", id, item, model, country);
	}

}
