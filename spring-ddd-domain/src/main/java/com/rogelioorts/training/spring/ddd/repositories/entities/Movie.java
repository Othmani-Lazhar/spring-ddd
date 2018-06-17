package com.rogelioorts.training.spring.ddd.repositories.entities;

import com.rogelioorts.training.spring.ddd.repositories.value.objects.CensoringLevel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Movie {

	@EqualsAndHashCode.Include
	private String id;
	
	private String title;
	
	private String image;
	
	private String description;
	
	private String streamUrl;
	
	private double puntuation;

	private CensoringLevel censoringLevel;
	
}