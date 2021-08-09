package day01;

import java.util.ArrayList;
import java.util.List;

public class Question04 {
    /*
     * Write a method that accepts an Array and returns the number/s that are not
     * repeated in an ArrayList. Method returns the numbers in aN ArrayList. EX:
     * arr = {1,1,2,2,3,3,4,5} ---> [4,5]
     */
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,5};
        notRepeatedNumbers(arr);
    }

    private static void notRepeatedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]  && i!=j){
                    count++;
                }
            }if(count==0){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
