package archives;


/* 
Version: 1.0
Title: Largest palindrome product
Des: A simple program that gets the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
Last Modified 7/4/2020
Author: Brian O Cnaimhsi 
GitHub: https://github.com/brianocnaimhsi
Website https://www.linkwebbie.com/developers/brianocnaimhsi/
Challenge Url: https://projecteuler.net/problem=5
Copyright 2020, Brian O Cnaimhsi
Licensed under The MIT License: http://www.opensource.org/licenses/mit-license
Developer Note - A simple program that I have written which solves the fifth problem on Project Euler. Uses the divisor algorithm to get the greatest common divisor (GCD).  */



public class SmallestMultiple extends Problem {
	
	//Get the multiple of the range of numbers 
	private long GetMultiple(int range) {
		
		//the lowest common factor set to one
		long lcm = 1;
		
		for(int i = 2; i <= range; ++i) {
			lcm *= i / gcd(lcm,i);
		}
		
		//return the lowest common factor
		return lcm;
		
	}
	
	
	//find the greatest common divisor of two numbers 
	private long gcd(long a, long b) {
		
		//varibles that will be used to get the gcd
		long dividend = a, divisor = b, quotient, remainder;
		
		do 
		{
			//dividend = dividend / divisor; 
			quotient = dividend / divisor; //gets the quotient
			remainder = dividend % divisor; //gets the remainder
			
			//if the remainder is not 0 change the values about to continue the loop 
			if(remainder != 0) {
				//assign the divisor as the dividend 
				dividend = divisor; 
				//assign the remainder as the new divisor 
				divisor = remainder;
				
			}
			
			
		}while(remainder != 0);
		
		//return the Greatest Common Divisor
		return divisor;
		
	}
	
	
	
	//Generate the results for the problem
	@Override 
	public String generateResults() {
		return GetMultiple(20) + "";
	}

}
