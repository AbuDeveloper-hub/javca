package day_02_logic_programs;

import java.util.Scanner;

public class sum_ofodd_sum_of_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0,odd=0,even=0,remainder=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Number :");
		num = scan.nextInt();
		
		while(num>0) {
			remainder = num%10;
			if(remainder % 2 == 0)
				even += remainder;
			else
				odd += remainder;
			
			num = num/10;
				
		}
		System.out.println("even numbers sum is : "+even);
		System.out.println("odd numbers sum is : "+odd);

		
	}

}
