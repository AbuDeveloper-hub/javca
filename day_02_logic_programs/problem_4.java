package day_02_logic_programs;

import java.util.Iterator;
import java.util.Scanner;

public class problem_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//problem : 
		//input : 123
		//output : 300+20+1
		int number = 0,rev=0,remainder=0,sumrev=0;
		
	
		
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		String le = Integer.toString(number);
		int len = le.length();
		
		
		//methiod-1
		
//		while(number > 0) {
//			remainder = number%10;
//			sumrev = sumrev * 10+remainder;
//			number = number/10;
//			
//		}
//		System.out.println(sumrev);
		
//		sumrev = 0;
//		int dlt=100;
//		for (int i = 0; i<len;i++) {
//			remainder = number%10;
//			sumrev = remainder * dlt;
//
//			dlt = dlt/10;
//			number = number/10;
//			System.out.print(sumrev+"+");
//		}
		
		
		
		//method-2
		int c=0;
		while(number>0) {
			remainder = number % 10;
			remainder = (int) (remainder * Math.pow(10, len-1));
			len--;
			number = number/10;
			System.out.println(remainder);
		}
	}

}
