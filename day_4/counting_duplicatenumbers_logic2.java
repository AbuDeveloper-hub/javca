package day_4;

import java.util.Arrays;

public class counting_duplicatenumbers_logic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,50,20,10,60,10,20,50,20,10,60,20};
		int freq[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int no = arr[i];
			int count =1;
			
			for(int j=i+1;j<arr.length;j++) {
				if(no == arr[j]) {
					count++;
				    freq[j]=-1;
				}
				
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
				
		}
		
		
		for(int k=0;k<freq.length;k++) {
			if(freq[k]!=-1) {
				System.out.println(arr[k] +" is "+freq[k]+" Times Repeat");
		
			}


		}
		

	}

}
