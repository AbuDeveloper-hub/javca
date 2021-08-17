package day_01;
import java.util.*;

public class odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		a = scan.nextInt();
		
		if(a%2 == 0)
			System.out.println("this is even number");
		else
			System.out.println("this is odd number");
	}

}
