package archives;

/* 
Version: 1.0
Title: 10001st prime
Des: A program that finds 10001st prime number. 
Last Modified 7/29/2020
Author: Brian O Cnaimhsi 
GitHub: https://github.com/brianocnaimhsi
Website https://www.linkwebbie.com/developers/brianocnaimhsi/
Challenge Url: https://projecteuler.net/problem=7
Copyright 2020, Brian O Cnaimhsi
Licensed under The MIT License: http://www.opensource.org/licenses/mit-license
Developer Note - A simple program that finds the 10001st prime number.*/



public class TenThousandAndOnePrimeNumber extends Problem {

	public String primeNumber(int numberOfPrimes) {
		
		//Total primes found
		int totalPrimes = -1;
		int largestPrime = 0;
		int counter = 0;
		
		//Iterates until the n th has been found
		while (totalPrimes <= numberOfPrimes) {

			// Check prime
			if (isPrime(counter)) {

				largestPrime = counter;
				totalPrimes++;

			}

			counter++;
		
			
		}

		return String.valueOf(largestPrime);

	}

	// Check if number is prime
	public boolean isPrime(int number) {

		boolean isPrime = true;
		int counter = 2;

		while (counter <= number / 2) {

			// Check if that number has a multiple
			if (number % counter == 0) {

				isPrime = false;
				break;

			}

			counter++;
		}

		return isPrime;
	}

	// Generate the results for the problem
	@Override
	public String generateResults() {

		return primeNumber(10001) + "";
	}

}
