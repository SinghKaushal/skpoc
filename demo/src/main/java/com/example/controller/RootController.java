package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import static com.example.constant.Constants.*;

import com.example.model.Brand;
import com.example.model.WeatherReport;
import com.example.repository.BrandRepository;

/**
 * This is RootController class consists multiple methods , used to handle HTTP request.
 * @author Kaushal
 *
 */
@RestController
public class RootController {
	
	private static final Logger logger = LoggerFactory.getLogger(RootController.class);
	
	@Autowired
	BrandRepository brandRepo;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView hello() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/AjaxForWeatherRestApi", method = RequestMethod.POST)
	Map<String, String> getWhetherData() {

		logger.info("AJAX call is comming for whether report request !!");

		RestTemplate restTemplate = new RestTemplate();
		WeatherReport weather = restTemplate.getForObject(WEATHER_URI,
				WeatherReport.class);

		Map<String, String> mapVal = new HashMap<String, String>();
		mapVal.put(NAME, weather.getName());
		mapVal.put(LON, weather.getCoord().getLon().toString());
		mapVal.put(LAT, weather.getCoord().getLat().toString());
		mapVal.put(DESCRIPTION, weather.getWeather().get(0).getDescription());

		return mapVal;

	}

	@RequestMapping(value = "/AjaxForDBData", method = RequestMethod.GET)
	List<Brand> getDBData() {

		logger.info("AJAX call is comming for MongoDB Data request !!");

		return brandRepo.findAll();
	}
}
