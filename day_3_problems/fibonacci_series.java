package day_3_problems;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0,temp1=0,temp2=1,fib=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number To Find Fibonacci series :");
		num = scan.nextInt();
		
		System.out.print(temp1+" ");
		for(int i=0;i<num-1;i++) {
			fib = temp1+temp2;
			temp1 = temp2;
			temp2 = fib;
			System.out.print(fib+" ");
		}
		
	}

}
