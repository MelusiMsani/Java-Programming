package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberRangeSummarizerApplication numberrangesummarizer = new NumberRangeSummarizerApplication();
		
		
		try {
			// Unit test lists from 0-5
			// Counter to indicate which list is being processed at present
			int counter = 0;
			String list0 = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
			String list1 = "2,3,5,7,2,56,9,4,6,8,5,6,7,8,8,8,9,0,10,24,5666";
			String list2 = "0,4,6,7,8,9,-1,-5,-4,-3,-2,2,5,6,10,11,43,44,45,46,46,47";
			String list3 = "2,3,4,5,6,9,10,11,80";
			String list4 = "10000000,10000";
			String list5 = "1,2,3,4,5,6,7,7,8,9,11,12,13,14,15,16,17,20";
			
			
			//
			String[] temp = list0.split(",");
			String list = "";
			for(String a : temp) { 
				list = list + a;
			}
			
			
			if(!list.matches("[0-9]+")) {
				throw new IllegalListException();
			}else {
				Collection<Integer> collection = new ArrayList<>();
				String result = "";
				switch(counter) {
				case 0:
					collection = numberrangesummarizer.collect(list0);
					result = result + numberrangesummarizer.summarizeCollection(collection);
				
					System.out.println("Unit Test #0");
					System.out.println("Sample Input : " + list0);
					System.out.println("Result: " + result);
					System.out.println();
				case 1:
					collection = numberrangesummarizer.collect(list1);
					result = numberrangesummarizer.summarizeCollection(collection);
				
					System.out.println("Unit Test #1");
					System.out.println("Sample Input : " + list1);
					System.out.println("Result: " + result);
					System.out.println();
				case 2:
					collection = numberrangesummarizer.collect(list2);
					result = numberrangesummarizer.summarizeCollection(collection);
				
					System.out.println("Unit Test #2");
					System.out.println("Sample Input : " + list2);
					System.out.println("Result: " + result);
					System.out.println();
				case 3:
					collection = numberrangesummarizer.collect(list3);
					result = numberrangesummarizer.summarizeCollection(collection);
				
					System.out.println("Unit Test #3");
					System.out.println("Sample Input : " + list3);
					System.out.println("Result: " + result);
					System.out.println();
				case 4:
					collection = numberrangesummarizer.collect(list4);
					result = numberrangesummarizer.summarizeCollection(collection);
				
					System.out.println("Unit Test #4");
					System.out.println("Sample Input : " + list4);
					System.out.println("Result: " + result);
					System.out.println();
				case 5:
					collection = numberrangesummarizer.collect(list5);
					result = numberrangesummarizer.summarizeCollection(collection);
				
					System.out.println("Unit Test #5");
					System.out.println("Sample Input : " + list5);
					System.out.println("Result: " + result);
					System.out.println();
				}
				
			
			}
		
		}catch(IllegalListException e) {
			e.printStackTrace();
		}
	}

}
