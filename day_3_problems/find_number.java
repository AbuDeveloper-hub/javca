package day_3_problems;

import java.util.Scanner;

public class find_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {10,20,40,50,60};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to Find :");
		int find = scan.nextInt();
		
		for(int i=0;i<num.length;i++)
			if(num[i] == find) {
				System.out.println(find + " number location is "+ ++i);
			}

	}

}
