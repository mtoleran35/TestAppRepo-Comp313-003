package com.mt.testapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mt.testapi.model.Meal;

public interface MealRepository extends JpaRepository<Meal, Integer> {

}
