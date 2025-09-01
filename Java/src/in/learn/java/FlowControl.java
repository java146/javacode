package in.learn.java;

import java.util.Iterator;

public class FlowControl {
	
	//
	
	public static void main(String[] args) {
		int a = 10;
		
		if(a == 10) {
			System.out.println("Yes! true");
		}else {
			System.out.println("No! false");
		}
		
		if(a==30)System.out.println("Good! job");
		
		switch (a) {
		case 1000000000:
			System.out.println("Print 10");
			break;
		case 20:
			System.out.println("Print 20");
			break;
		default:
			System.out.println("NA");
		}
		
		// while loop
		
//		while (a != 10) {
//			System.out.println("Print 10");
//		}
		
//		while (en.hasMoreElements()) {
//			type type = (type) en.nextElement();
//			
//		}
//		
//		while (it.hasNext()) {
//			type type = (type) it.next();
//			
//		}
//		
//		while (condition) {
//			
//		}
		
		do {
			System.out.println("Do While loop...");
		} while (a > 200);
		
		
		for (Integer numberOfStudnet : args) {
			
		}
		
		for (int string : new int[] {1,2}) {
			
		}
	
	}

}
