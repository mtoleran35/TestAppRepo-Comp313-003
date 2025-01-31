package com.mt.testapi.service;

import java.util.List;

import com.mt.testapi.model.Meal;

public interface MealService {
	String createMeal(Meal meal);
	String updateMeal(Meal meal);
	String deleteMeal(int mealId);
	Meal getMeal(int mealId);
	List<Meal> getAllMeals();
}
