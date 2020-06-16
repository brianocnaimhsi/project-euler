package archives;

import java.util.ArrayList;

/* 
Version: 1.0
Title: Mutiples of Numbers
Des: A simple program that gets the mutiples of 5 and 3 
Last Modified 10/28/2019
Author: Brian O Cnaimhsi 
GitHub: https://github.com/brianocnaimhsi
Website https://www.linkwebbie.com/developers/brianocnaimhsi/
Challenge Url: https://projecteuler.net/problem=1
Copyright 2019, Brian O Cnaimhsi
Licensed under The MIT License: http://www.opensource.org/licenses/mit-license
Developer Note - I could expand this further by allowing users to enter the number they would like to use 
but I wanted to keep it short and simple to prove that I had solved this problem. */


public class Multiplesof3and5 extends Problem {

	//an arraylist that will contain the numbers that the program will find the multiples too
	private ArrayList<Integer> numbers = new ArrayList<Integer>();

	//the constructor
	public Multiplesof3and5() {

		//add 3 to the array list
		numbers.add(3);
		//add 5 to the array list
		numbers.add(5);

	}

	//displays the multiples of a given number
	private ArrayList<Integer> getMultiples(int number){

		//the arraylist of Integers
		ArrayList<Integer> intergers = new ArrayList<Integer>();

		//loop through to check for multiple of that number
		for(int i = 1; i < 1000; i++){

			//check if that number is a multiple
			if((i % number) == 0){

				//add the number to the arraylist
				intergers.add(i);

			}


		}//end of for

		//return the arraylist
		return intergers;

	}//end of getMultiples



	//generates even multiples result
	@Override
	public String generateResults() {

		//the string that will contain all the Multiples of the given numbers
		String numberMultiples = "";
		
		//go through the supplied numbers eg.. 3 or 5
		for(Integer number : numbers){
			
			//the sum of the number
			int sum = 0;
			
			//find the sum of the multiples
			for(Integer multiple : getMultiples(number) ){
				
				//add the multiple to the sum of numbers 
				sum += multiple;
				
				
				
				
			}//end of inner for
			
			//append the sum into number multiples
			numberMultiples += " Sum of Multiple " + number + sum + "\t";
			
		}
		
		return numberMultiples;


	}//end of evenFibonacci


}//end of class
