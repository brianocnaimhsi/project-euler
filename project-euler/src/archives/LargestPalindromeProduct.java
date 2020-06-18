package archives;


/* 
Version: 1.0
Title: Largest palindrome product
Des: A simple program that gets the Largest palindrome product of three digits
Last Modified 6/18/2020
Author: Brian O Cnaimhsi 
GitHub: https://github.com/brianocnaimhsi
Website https://www.linkwebbie.com/developers/brianocnaimhsi/
Challenge Url: https://projecteuler.net/problem=4
Copyright 2020, Brian O Cnaimhsi
Licensed under The MIT License: http://www.opensource.org/licenses/mit-license
Developer Note - This is a simple program that is open to improvements I will at a later stage make this 
program more efficient */


public class LargestPalindromeProduct extends Problem{


	//declaring the number of digits 
	private int numOfDigits;

	//the constructor
	public LargestPalindromeProduct() {
		//three digits numbers range 100 - 999
		numOfDigits = 3;

	}

	//returns the 1 with the number of zeros the user has placed in
	private long appendZeros(int numberOfZeros) {

		//will contain the number that will be returned
		StringBuilder stringNumber = new StringBuilder("1"); 

		//loop for the number of zeros
		for(int i = 0; i < numberOfZeros; i++) {
			//add the zero to the string builder
			stringNumber.append('0');

		}

		//convert the string builder to a long 
		return Long.parseLong(stringNumber.toString());
	}


	//generates the largest palindrome product
	@Override 
	public String generateResults() {

		//the highest palindrome product 
		long highestPal = 0;

		//lower limit eg 100
		long lowerLimit = appendZeros(numOfDigits - 1);

		//upper limit eg 999 
		long upperLimit = appendZeros(numOfDigits);

		//loop starting at the lower limit all the way to the upper 
		for(long i = lowerLimit; i < upperLimit; i++) {

			for(long y = i; y < upperLimit; y++) {

				//do the mutiply then convert to string using wrapper class
				String temp = Long.toString(i * y);

				//the same number reversed 
				String reverse = new StringBuffer(temp).reverse().toString();

				//check for palindrome by comparing the number with it being reversed
				if(temp.equals(reverse)) {

					//check if highestPal is less than the current temp 
					if(highestPal < Long.parseLong(temp)) {
						//set the highest pal
						highestPal = Long.parseLong(temp);
					}

				}//end of if



			}//end of inner for 

		}//end of outer for


		//return the result of the largest palindrome 
		return "The largest palindrome product with " + numOfDigits + " digits is " + highestPal ;




	}//end of generateResults


}//end of class
