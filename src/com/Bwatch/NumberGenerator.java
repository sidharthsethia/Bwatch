package com.Bwatch;

import java.util.Random;

	public class NumberGenerator {
		int n;
	public int NGen(int x){
		Random rand = new Random();
		 n = rand.nextInt(20) + (x-10);                                 ;
		//x-10 minimum and x+10 is our maximum
		
		return n;
	}
}
