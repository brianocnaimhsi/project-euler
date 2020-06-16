package archives;

/* 
Version: 1.0
Title: Even Fibonacci Numbers
Des: A simple program that Even Fibonacci Numbers
Last Modified 12/23/2019
Author: Brian O Cnaimhsi 
GitHub: https://github.com/brianocnaimhsi
Website https://www.linkwebbie.com/developers/brianocnaimhsi/
Challenge Url: https://projecteuler.net/problem=2
Copyright 2019, Brian O Cnaimhsi
Licensed under The MIT License: http://www.opensource.org/licenses/mit-license
Developer Note - This is a simple program that will display simple even fibonacci numbers. */

public class EvenFibonacciNumbers extends Problem{

	//the max number to where the for loop will go to
	private int highestIteration;
	//the starting number where the for loop will begin
	private int startingIteration;
	
	
	//the default constructor
	public EvenFibonacciNumbers() {
		
		super();
		highestIteration  = 40;
		startingIteration = 0;
		
		
	}
	
	//the custom constructor
	public EvenFibonacciNumbers(int highestIteration, int startingIteration) {
			
		super();
		this.highestIteration  = highestIteration;
		this.startingIteration = startingIteration;
			
	}
	
	
	
	//generates even fibonacci numbers
	@Override
	public String generateResults() {
			
			//the varibles that will contain the fibonacci numbers
			int n1 = 0, next = 1; 
			
			//the string that will contain all the even fibonacci numbers
			String evenFibonacciNums = "";

			
			for(int i = startingIteration; i < highestIteration; i++) {
				
				//the sum of the two numbers
				int sum = n1 + next;
				//set the next to n1
				n1 = next;
				//set next to the sum
				next = sum;
				//check if its even number 
				if(sum % 2 == 0) {
					
					//assign fibonacci number
					evenFibonacciNums += " " + sum;
				}
				
				
			}//end of for
			
			//return the list even Fibonacc Numbers
			return evenFibonacciNums;
			
			
		}//end of evenFibonacci
	

	
}//end of class
