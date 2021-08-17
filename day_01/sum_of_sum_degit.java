package day_01;
import java.util.*;
public class sum_of_sum_degit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0,r=0,sum2=0,t=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to sum + sum :");
		num = input.nextInt();
//		while(a>0) {
//			r = a%10; 
//		}
		while(num>0) {
			r = num%10; // to get remainder
			sum = sum+r;  // add the remainder to sum
			num = num/10; // to delete last disit
			sum2= sum%10+sum/10;
		}
		t=sum+sum2;
		System.out.println("First Sum value :"+sum);
		/*
		 * if (sum > 9) { while(sum!=0) { r = sum%10; // to get remainder sum2 = sum2+r;
		 * // add the remainder to sum sum = sum/10; // to delete last disit }
		 * 
		 * }
		 */
		System.out.println("second sum :"+sum2);
		System.out.println("total sum :"+t);
		
	}

}
