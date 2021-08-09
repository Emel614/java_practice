package day01;
import java.util.Arrays;
import java.util.Random;

public class Question03 {
    /*Write a method that accepts an Array of ints returns the sorted Array in
       ascending order.Do not use the sort method.
        */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedArray(arrayGenerator(5))));
    }
    public static int [] sortedArray(int [] arr){
        //int temp=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static int [] arrayGenerator(int number){
        int [] arr = new int [number];
        for(int i=0; i<arr.length; i++)
            arr[i]=new Random().nextInt(20);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}


