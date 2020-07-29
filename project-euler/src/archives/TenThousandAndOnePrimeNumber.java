package archives;

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
