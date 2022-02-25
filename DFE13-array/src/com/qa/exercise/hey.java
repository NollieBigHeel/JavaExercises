package com.qa.exercise;

public class hey {
	
	public static void arrays() {
		String [] animals = {"cat", "dog", "flamingo", "octopus", "Kangaroo"};
//		System.out.println(animals);    
		for(String a: animals) {
			System.out.println(a);
		}
		
		for(int i = 0; i < animals.length; i ++) {
			if(i % 2 == 0)
				System.out.println(animals[i]);
		}
		
	}

}
