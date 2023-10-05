package com.example.cardapio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.model.Food;
import com.example.cardapio.repository.FoodRepository;


@RestController
@RequestMapping("food")
public class FoodController {
	
	@Autowired(required = true)
	private FoodRepository repository;
	
	
	@GetMapping
	public List<Food> getAll() {
		
		List<Food> foodList = repository.findAll();
		return foodList;
	}
}
