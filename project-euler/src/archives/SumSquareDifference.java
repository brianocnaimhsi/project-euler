package archives;

/* 
Version: 1.0
Title: Sum Square Difference
Des: A program that finds difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
Last Modified 7/4/2020
Author: Brian O Cnaimhsi 
GitHub: https://github.com/brianocnaimhsi
Website https://www.linkwebbie.com/developers/brianocnaimhsi/
Challenge Url: https://projecteuler.net/problem=6
Copyright 2020, Brian O Cnaimhsi
Licensed under The MIT License: http://www.opensource.org/licenses/mit-license
Developer Note - I used a for loop to find the differences of the sum of first one natural numbers and the square of the sum*/



public class SumSquareDifference extends Problem {
	
	
	
	//Get the sum of squares.
	public String sumOfNums(long range) {
		
		//Sum is set to zero.
		long sum = 0, sumSquared = 0;
		
		//Sum up the values.
		for(long i = 0; i <= range; i++) {
			
			sum += i;
			sumSquared += Math.pow(i, 2);
			
		}
		
		//Return the sum.
		return "The Difference between " + sumSquared + " - " + sum + " = " + Math.abs((long)Math.pow(sum, 2) - sumSquared); 
	}
	
	//
	
	
	//Generate the results for the problem
	@Override 
	public String generateResults() {
		return sumOfNums(100) + "";
	}
}
