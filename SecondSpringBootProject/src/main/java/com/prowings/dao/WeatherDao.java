package com.prowings.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prowings.model.Weather;


public interface WeatherDao extends JpaRepository<Weather, Integer> {

	

}
