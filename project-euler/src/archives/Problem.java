package archives;

public abstract class Problem {
	
	//the total number of ID that has been issued
	private static int numID = 1;
	//the id of the problem starts at one
	private final int ID = numID;
	//the title of the problem
	private String title;
	
	//problem constructor 
	public Problem() {

		//increment the numID by one
		numID++;

	}
	
	//get the ID of object
	public int getProbID() {
		
		return ID;
		
	}
	
	//the name of the problem
	public  String getName() {
		
		return getClass().getName();
		
	};
	
	//the result method that will generate the result
	public abstract String generateResults();
	
}//end of class
