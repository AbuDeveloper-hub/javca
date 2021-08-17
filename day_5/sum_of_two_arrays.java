package day_5;

public class sum_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {10,80,50,60,30,40};
		int[] num2 = {90,80,45,65,70,10};
		
		int sol[]= new int[6];
		
		for(int i=0;i<num1.length;i++) {
			sol[i] = num1[i]+num2[i];
		}
		
		for(int j=0;j<num2.length;j++) {
			System.out.println(sol[j]);
		}
	}

}
