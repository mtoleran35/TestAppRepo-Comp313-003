package com.mt.testapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mt.testapi.model.Meal;
import com.mt.testapi.service.MealService;

@RestController
@RequestMapping("/dietplanner")
public class MealController {

	MealService mealService;
	public MealController(MealService mealService) {
		this.mealService = mealService;
	}
	
	@GetMapping("{mealId}")
	public Meal getMealDetails(@PathVariable int mealId) {
		return mealService.getMeal(mealId);
	}
	
	@GetMapping()
	public List<Meal> getAllMealDetails() {
		return mealService.getAllMeals();
	}
	
	@PostMapping
	public String createMealDetails(@RequestBody Meal meal) {
		mealService.createMeal(meal);
		return "Meal created succesfully";
	}
	
	@PutMapping
	public String updateMealDetails(@RequestBody Meal meal) {
		mealService.updateMeal(meal);
		return "Meal updated succesfully";
	}
	
	@DeleteMapping("{mealId}")
	public String deleteMealDetails(@PathVariable int mealId) {
		mealService.deleteMeal(mealId);
		return "Meal deleted succesfully";
	}
}
