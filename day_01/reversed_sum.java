package day_01;

import java.util.Scanner;

public class reversed_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0,rev=0,reverse = 0;
		
		int remainder = 0,sum =0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to Reverse :");
		num = scan.nextInt();
		
		String sn = Integer.toString(num);
		
		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;
			num=num/10;
		}
		System.out.println("The reverse number is : "+ rev); //rev has a oriinal value
		
		reverse = rev;  //copy reversed value
		
		//sum of degit
		
		for(int i=0;i<sn.length();i++) {
			  while(reverse>0) { 
				  remainder = reverse%10; 
				  sum = sum+remainder; 
				  reverse =reverse/10;
				  
			  }
			  rev=rev/10;
			  reverse = rev;
			 
		}
		 System.out.println("reverse of sum :"+sum);

		 
	
		

		
		
		
		
				

	}

}
