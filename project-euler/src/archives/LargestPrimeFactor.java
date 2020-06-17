package archives;

/* 
Version: 1.0
Title: Largest Prime Factor
Des: A simple program that gets the largest prime factor
Last Modified 12/17/2020 MM//DD/YYYY
Author: Brian O Cnaimhsi 
GitHub: https://github.com/brianocnaimhsi
Website https://www.linkwebbie.com/developers/brianocnaimhsi/
Challenge Url: https://projecteuler.net/problem=3
Copyright 2019, Brian O Cnaimhsi
Licensed under The MIT License: http://www.opensource.org/licenses/mit-license
Developer Note - This is a simple program that will get the biggest prime factor of a number. */



public class LargestPrimeFactor extends Problem {

	
	//the biggest prime factor
	private long biggestPrimeFactor;
	
	//the constructor
	public LargestPrimeFactor() {
		
		biggestPrimeFactor = 600851475143L;
		
	}

	//get the largest prime factor
	private long getLargestPrimeFactor(long num) {

		//the number that will be returned
		long i;
		//set the duplicate to the num 
		long duplicate = num;

		//starts at 2 to skip one
		for(i = 2; i <= duplicate; i++ ) {
			
			//check if i can divide into duplicate number 
			if(duplicate % i == 0) {

				//divide duplicate by i
				duplicate /= i;
				//decrement i
				i--;
				
			}


		}

		//return the biggest prime number 
		return i;

	}//end of get largest prime factor


	//generate the results
	@Override 
	public String generateResults() {

		return "The biggest prime factor of "+ biggestPrimeFactor + " is " + getLargestPrimeFactor(biggestPrimeFactor);

	}
















}//end of class
