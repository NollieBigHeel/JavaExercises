package com.qa.catDemo;

public class catO {
	
	public String name;
	public int age;
	public String breed;
    public boolean chonk;
    public static String speak = "meow";
    public static int id = 0;
    
    public catO(String nameP, int ageP, String breedP, boolean chonkP) {
    	
    	this.name = nameP;
    	this.age = ageP;
    	this.breed = breedP;
    	this.chonk = chonkP;
    	id++;
    }

	@Override
	public String toString() {
		return "catO [name=" + name + ", age=" + age + ", breed=" + breed + ", chonk=" + chonk + "]";
	}

	public static void catz() {
		System.out.println("I like catz");
	}
	
	public static void catId() {
		System.out.println(catO.id);
	}
	}

	
	
    

