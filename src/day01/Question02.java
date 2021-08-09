package day01;

import java.util.Arrays;
import java.util.Random;

public class Question02 {
    /* Write a method that accepts an Array of integers
     * and returns the second max.*/
    public static void main(String[] args) {
        System.out.println(secondMax(arrayGenerator(5)));
    }
    public static int[] arrayGenerator(int number){
        int [] arr = new int[number];
        for(int i=0; i< arr.length; i++)
            arr[i]= new Random().nextInt(20);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static String secondMax(int [] arr){
        int max = 0;
        int secMax = 0;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }else if(arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
        }
        return "Max= "+max+"\nSecondMax= "+secMax;
    }

}
