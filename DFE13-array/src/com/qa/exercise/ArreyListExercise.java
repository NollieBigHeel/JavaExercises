package com.qa.exercise;

import java.util.ArrayList;

public class ArreyListExercise {
	
	public static ArrayList<String> orders = new ArrayList<>();
	public static ArrayList<String> doneOrder = new ArrayList<>();
	
	
	public static void newOrders (String order) {
		
		orders.add(order);
		
	}	
	
	public static ArrayList<String> printOrders( ) {
		return orders;
	}


		
	}



	
	
	
	


