package tester;
import archives.*;

public class ProblemTester {

	public static void main(String[] args) {
	
		//Multiplesof3and5 ID1
		Multiplesof3and5 id1 = new Multiplesof3and5(); 
		//Even Fibonacci Numbers ID2
		EvenFibonacciNumbers id2 = new EvenFibonacciNumbers();
		//Largest Prime Factor ID3
		LargestPrimeFactor id3 = new LargestPrimeFactor();
		//Largest Palindrome Product ID4
		LargestPalindromeProduct id4 = new LargestPalindromeProduct();
		
		//test the problems
		displayProblemSection(id1);
		displayProblemSection(id2);
		displayProblemSection(id3);
		displayProblemSection(id4);
		
		
		
		


	}
	
	
	//display the result of each problem
	public static void displayProblemSection(Problem prob) {
	
		//start of the section
		System.out.println("!----- Start of Problem " + prob.getProbID() + " -----!");
		
		//new line
		System.out.println("");
		
		//the ID of the problem
		System.out.println("Id of Problem : " + prob.getProbID());
		
		//new line
		System.out.println("");
		
		//the name of the problem
		System.out.println("Name of Problem : " + prob.getName());
		
		//new line
		System.out.println("");
		
		//the results of the problem
		System.out.println("Result : " + prob.generateResults());
		
		System.out.println("");
		
		
		System.out.println("!----- End of Problem " + prob.getProbID() + " -----!");
		//new line
		System.out.println("");
		
		//the divider line
		System.out.println("---------------------------------------------------------------------------------------------");
		
		//new line
		System.out.println("");
				
		
		
		
	}//end of display result

}
