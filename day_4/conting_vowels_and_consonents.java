package day_4;

public class conting_vowels_and_consonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "jamal mohammed college";
		String n[] = name.split(" ");
		
		int vowel=0,consonent=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				vowel++;
			}
			else {
				consonent++;
			}
		}
		System.out.println("The vowels are :"+vowel);
		System.out.println("The consonents are :"+consonent);

	}

}
