package com.mt.testapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mt.testapi.model.Meal;
import com.mt.testapi.repo.MealRepository;

@Service
public class MealServiceImpl implements MealService {

	MealRepository mealRepository;
	
	public MealServiceImpl(MealRepository mealRepository) {
		this.mealRepository	= mealRepository;
	}
	
	@Override
	public String createMeal(Meal meal) {
		// More Business Logic
		mealRepository.save(meal);
		return "Create Meal Success";
	}

	@Override
	public String updateMeal(Meal meal) {
		// More Business Logic
		mealRepository.save(meal);
		return "Update Meal Success";
	}

	@Override
	public String deleteMeal(int mealId) {
		// More Business Logic
		mealRepository.deleteById(mealId);
		return "Delete Meal Success";
	}

	@Override
	public Meal getMeal(int mealId) {
		return mealRepository.findById(mealId).get();
	}

	@Override
	public List<Meal> getAllMeals() {
		return mealRepository.findAll();
	}

}
