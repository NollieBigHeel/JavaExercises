package com.qa.runner;

//import com.qa.cakeDemo.CakeTin;
import com.qa.catDemo.catO;

public class Runner {

	public static void main(String[] args) {
		
//		CakeTin spongeCake = new CakeTin("Vanilla", 2, false, "beige");
//		// give us an ID reference like an array
//		System.out.println(spongeCake);
//	
//		System.out.println(spongeCake.flavour);
		
		catO cat1 = new catO("Puss", 5, "Siamese", true);
		
		catO cat2 = new catO("Maggie", 14, "Ginge", true);
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println('\n');
		System.out.println(catO.speak);
		catO.catz(); 

		
				
		if (cat1.chonk == cat2.chonk) {
			System.out.println("2 Fat cats!" + '\n' + "Chonks!");
			} else {
				System.out.println("1 fat cat!");
			}
		
		 
			
		
	}

}
