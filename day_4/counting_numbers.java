package day_4;

import java.util.Arrays;

public class counting_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {20,30,40,50,10,20,50,10,40,90,80,70,10,30,70,80};
		
		countnumbers(arr);
		
	}
		
	static void countnumbers(int arr[]) {
			Arrays.sort(arr);
			int arr1[]= {};
			int a=0;
			
			for(int i=0;i<arr.length-1;i++) {
				
				int counter = 1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) 
						counter++;
					else
						break;
					
				}
				if(counter==1) {
					
					System.out.println(arr[i]+" -> "+counter);
					i+=(counter-1);
					
				}
				else if(counter>1)
				{
			        System.out.println(arr[i]+" -> "+counter);
					
					i+=(counter-1);
				}

				
			}
	}
		
		
//		for(int i=0;i<a.length;i++) {
//			int count = 0;
//			int count_num = a[i];
//			for(int j=0;j<a.length;j++) {
//				if(count_num == a[j]) {
//					count =count+1;
//				}
//				System.out.println(a[i]+" is "+count+" times");
//			}
//			
//			
//		}
		
		


}
