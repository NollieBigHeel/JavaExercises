package com.qa.runner;

import com.qa.exercise.ArreyListExercise;


public class Runner {

	public static void main(String[] args) {

		ArreyListExercise.newOrders("Black");
		System.out.println(ArreyListExercise.printOrders());
	}

}
