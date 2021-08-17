package day_5;

public class sum_odd_number_arrays {

    public static void main(String args[]) {
        int number[] = {15,20,35,40,45,50,80,99};
        int sum = 0;
        
        for(int i=0;i<number.length;i++){
            if(number[i] % 2 != 0){
                sum = sum+number[i];
            }
        }
        System.out.println(sum);
    }
}
