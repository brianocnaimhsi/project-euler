package tester;
import archives.*;
import java.util.ArrayList;

public class ProblemTester {
	
	//The timing variables measures the length it takes for the problem to run
	static long startTime; 
	static long  endTime;
	
	public static void main(String[] args) {
	
		//Declare the array list of Problem Objects
		ArrayList<Problem> problems = new ArrayList<Problem>();
		
		//Add the Multiplesof3and5 ID1
		problems.add(new Multiplesof3and5()); 
		//Add Even Fibonacci Numbers ID2
		problems.add(new EvenFibonacciNumbers());
		//Add Largest Prime Factor ID3
		problems.add(new LargestPrimeFactor());
		//Add Largest Palindrome Product ID4
		problems.add(new LargestPalindromeProduct());
		//Add Smallest Multiple ID5
		problems.add(new SmallestMultiple());
		
		//For-each through all problem objects
		for(Problem prob : problems) {
			//display the problem results
			displayProblemSection(prob);
		}
		
	}
	
	
	//display the result of each problem
	public static void displayProblemSection(Problem prob) {
	
		//start of the section
		System.out.println("!----- Start of Problem " + prob.getProbID() + " -----!");
		//new line
		System.out.println("");
		//the ID of the problem
		System.out.println("Id of Problem : " + prob.getProbID());
		//the name of the problem
		System.out.println("Name of Problem : " + prob.getName());
		//End time 
		startTime = System.nanoTime();
		//the results of the problem
		System.out.println("Result : " + prob.generateResults());
		//End time
		long endTime = System.nanoTime();
		//print the running time of the problem
		System.out.println("Running Time : " + (endTime - startTime ) + " NanoSeconds");
		//new line
		System.out.println("");
		//the end line
		System.out.println("!----- End of Problem " + prob.getProbID() + " -----!");
		//new line
		System.out.println("");
		//the divider line
		System.out.println("---------------------------------------------------------------------------------------------");
		//new line
		System.out.println("");

		
	}//end of display result

}
