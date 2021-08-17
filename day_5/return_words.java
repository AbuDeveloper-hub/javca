package day_5;

import java.util.Iterator;

public class return_words {
	
	public static void main(String args[]) {
		
		String str = "Jamal Mohamed College, Trichy, Tamil Nadu";
		
		String[] str1 = str.split(" ");

		for(int i=1;i<str1.length;i+=2) {
			System.out.print(str1[i]+" ");
		}

		
	}
}
