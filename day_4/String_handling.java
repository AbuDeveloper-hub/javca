package day_4;

import java.util.Scanner;

public class String_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to reverse :");
		String name = scan.nextLine();
		
		String sword[] = name.split(" ");
		System.out.println("String Reverse :");
		for(int i=0;i<sword.length;i++) {
//			System.out.println(sword[i]);
			
			StringBuffer str = new StringBuffer(sword[i]);
			System.out.print(str.reverse()+" ");
		}
	}

}
