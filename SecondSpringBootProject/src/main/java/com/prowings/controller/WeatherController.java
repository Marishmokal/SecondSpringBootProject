package com.prowings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Weather;
import com.prowings.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	WeatherService weatherService;
	
	@PostMapping("/weather")
	public String createWeather(@RequestBody Weather weather)
	{
		weatherService.createWeather(weather);
		return "weather created";
	}
	
	@GetMapping("/weather/{id}")
	public Weather getWeatherById(@PathVariable("id")int id)
	{
		return weatherService.getWeatherById(id);
		
	}
	@PutMapping("/weather")
	public ResponseEntity<String> updateWeather(@RequestBody Weather weather)
	{
		try {
		 weatherService.updateWeather(weather);
		
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(HttpStatus.OK);
				
		
	}
	@DeleteMapping("/weather/{id}")
	public String deleteWeather(@PathVariable("id")int id)
	{
		weatherService.deleteWeather(id);
		return "Weather deleted";
	}
	@GetMapping("/weather")
	public ResponseEntity< List<Weather>>GetAllWeather()
	{
		
		return new ResponseEntity<>(weatherService.GetAllWeather(),HttpStatus.OK); 
		
	}
	@DeleteMapping("/weather")
	public String deleteAllWeather(Weather weather)
	{	
		weatherService.deleteAllWeather(weather);
		return "All deleted";
	}
	
}
