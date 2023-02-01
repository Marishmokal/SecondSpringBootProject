package com.prowings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.prowings.dao.WeatherDao;
import com.prowings.model.Weather;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	WeatherDao dao;
	
	@Override
	public void createWeather(Weather weather) {
		dao.save(weather);
		
	}

	@Override
	public Weather getWeatherById(int id) {
		return dao.findById(id).get();
		
	}

	@Override
	public void updateWeather(Weather weather) {
		Weather w=dao.findById(weather.getId()).orElseThrow();
		dao.save(weather);
		
	}

	@Override
	public void deleteWeather(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Weather> GetAllWeather() {
		
		return dao.findAll();
	}

	@Override
	public void deleteAllWeather(Weather weather) {
	dao.deleteAll();
		
	}

	

	

	

	

}
