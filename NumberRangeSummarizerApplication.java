package numberrangesummarizer;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *	The collect method accepts String as paramaters
 *	- Split the string into an array of String[] with the "," as the regrex expression
 *	-Loop throught the entire string array and add the elements of the String[] array into the List collection
 *	-Check if the element is not already in the list and add if not
 * 	-sort the collection 
 * 	-return the sorted list collection
 *   
 */


public class NumberRangeSummarizerApplication implements NumberRangeSummarizer {

	@Override
	public Collection<Integer> collect(String input) {
		
		String[] numbers = input.split(",");
		List<Integer> list = new ArrayList<Integer>();
		
		
		for(Object number : numbers ) {
			if(!list.contains(Integer.parseInt(number.toString())))
				list.add(Integer.parseInt(number.toString()));
			
		}
		
		Collections.sort(list);
		//Collection<Integer> collection = list;
		
		// TODO Auto-generated method stub
		return list;
	}
	
	/**
	 *	The summarizeCollection method accepts Collection<Integer> as input
	 *	- print the StringBuilder as the summarizeCollection string
	 *   
	 */

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		StringBuilder result = new StringBuilder();
		int previousNumber = -5;
		int counter = 0;
		int count = 0;
		boolean begin = true;
		int size = input.size() - 1;
		
		
		
		for(Integer number : input) {
			if(begin) {
				result.append(number);
				begin = false;
				
			}else if( previousNumber + 1 == number ) {
				counter++;
			}else if( counter >= 2 ) {
				result.append("-" + previousNumber+ ", "+ number);
				//result = result + "-" + previousNumber + ", " + number;
				counter = 0;
			}else {
				result.append(", " + number);
				//result = result + ", " + number;
			}
			count++;
			previousNumber = number;
		}
		
		// TODO Auto-generated method stub
		return result.toString();
	}

}
