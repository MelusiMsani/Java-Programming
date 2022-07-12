package numberrangesummarizer;

public class IllegalListException extends Exception {
	
	public IllegalListException() { super("Please note the list must abind to the format : x1,x2,x3,x4,... "
			+ "where x is an arbitrary element of real numbers"
			+ "\n"
			+ "\nSample Input: \"1,3,6,7,8,12,13,14,15,21,22,23,24,31"
			+ "\nResult: \"1, 3, 6-8, 12-15, 21-24, 31\" "); }
	
	public IllegalListException(String message) { super(message); }

}
