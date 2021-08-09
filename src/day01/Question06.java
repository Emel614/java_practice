package day01;

import java.util.Arrays;

public class Question06 {
    /*
     *  Write a method that checks to see if the words u pass is Anagram.
     *   EX: read and dear  --> true*/
    public static void main(String[] args) {
        System.out.println(isAnagram("read","dear"));

    }
    public static boolean isAnagram(String str1,String str2){
        char ch1 [] = str1.toCharArray();
        char ch2 [] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}
