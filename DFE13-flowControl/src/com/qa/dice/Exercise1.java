package com.qa.dice;

import java.util.Random;

public class Exercise1 {
	
	public static int dice3() {
		return new Random().nextInt(3) + 1;
	}
	
	public static int dice4() {
		return new Random().nextInt(4) +1;
	}
	
	public static int dice6() {
		return new Random().nextInt(6) + 1;
	}
	
	public static int dice8() {
		return new Random().nextInt(8) + 1;
		
	}
	
	public static int dice10() {
		return new Random().nextInt(10) + 1;
    }
	
	public static int sixSidedDicex4() {
		int r1 = dice6();
		int r2 = dice6();
		int r3 = dice6();
		int r4 = dice6();		
		int sum = r1 + r2 + r3 + r4;
		return sum;
	}
	
	public static int tenx2six () {
		int r110 = dice10();
		int r210 = dice10();
		int r16 = dice6();
		int sum = r110 + r210 + r16;
		return sum;
	}
}