package day_02_logic_programs;

import java.util.Scanner;

public class sum_of_degits {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a,r=0,s=0;
		System.out.println("Enter the numbers to sum :");
		a=scan.nextInt();
		

		
		/* This logic is to get last digit */
		while(a>0) {
			r = a%10; 
			s=s+r;
			a=a/10;
			
		}
		System.out.println(s);
		
	}

}
