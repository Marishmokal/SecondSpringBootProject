package com.prowings.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Weather {
	@Id
	int id;
	@Column
	String temprature;
	@Column
	String weatherCondition;
	@Column
	String region;
	@Column
	String indicator;
}
