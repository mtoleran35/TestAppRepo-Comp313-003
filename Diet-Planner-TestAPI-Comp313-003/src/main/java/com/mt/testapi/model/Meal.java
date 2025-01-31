package com.mt.testapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="meal")
public class Meal {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mealid;
	@Column(name="mealname")
	private String mealName;
	@Column(name="calories")
	private int calories;
	@Column(name="fat")
	private int fat;
	@Column(name="carbohydrate")
	private int carbohydrate;
	@Column(name="protein")
	private int protein;
	
	public int getMealid() {
		return mealid;
	}
	public void setMealid(int mealid) {
		this.mealid = mealid;
	}
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getCarbohydrate() {
		return carbohydrate;
	}
	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	public int getProtein() {
		return protein;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}
	
	public Meal(String mealName, int calories, int fat, int carbohydrate, int protein) {
		super();
		this.mealName = mealName;
		this.calories = calories;
		this.fat = fat;
		this.carbohydrate = carbohydrate;
		this.protein = protein;
	}
	
	public Meal() {}
	
	@Override
	public String toString() {
		return "Meal [mealid=" + mealid + ", mealName=" + mealName + ", calories=" + calories + ", fat=" + fat
				+ ", carbohydrate=" + carbohydrate + ", protein=" + protein + "]";
	}
	
	
	
	
	
	
	
}
