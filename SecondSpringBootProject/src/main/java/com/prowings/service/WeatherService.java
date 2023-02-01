package com.prowings.service;

import java.util.List;

import com.prowings.model.Weather;

public interface WeatherService {

	public void createWeather(Weather weather);

	public Weather getWeatherById(int id);


	public void updateWeather(Weather weather);

	public void deleteWeather(int id);

	public List<Weather>GetAllWeather();

	public void deleteAllWeather(Weather weather);

	



	

}
