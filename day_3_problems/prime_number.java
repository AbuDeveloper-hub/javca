package day_3_problems;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prime number
		
		int number = 100;
		String prime ="";
		
		Scanner scan = new Scanner(System.in);

		
		for(int i=1;i<=number;i++) {
			int counter = 0;
			for(int num=i;num>=1;num--) {
				if(i%num==0) {
					counter = counter+1;
				}
				
			}
			if(counter == 2) {
				prime = prime+i+" ";
			}
			
		}
		System.out.println(prime);
	}

}
