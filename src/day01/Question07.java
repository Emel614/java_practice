package day01;

public class Question07 {
    /*
     * Write a method that accepts an array and returns true
     * if the sum of all 3's in the array is exactly 9.
     * EX: Input : {2,3,5,3,6,3,7}
     * output :true
     * Input : {2,3,4,5,6,3,7}
     * output :false
     */
    public static void main(String[] args) {
        int [] arr = {2,3,5,3,6,3,7};
        System.out.println(sumOfThree(arr));
    }

    private static boolean sumOfThree(int[] arr) {
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==3){
                count++;
            }
        }if(count==3){
            return true;
        }else{
            return false;
        }
    }
}
