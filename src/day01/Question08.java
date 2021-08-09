package day01;

import java.util.ArrayList;
import java.util.List;

public class Question08 {
    // Write method that accepts a String and
    //removes all duplicate from String. EX : aaabbc --> abc
    public static void main(String[] args) {
        String str="aaabbc";
        System.out.println(removeDublicate(str));
    }

    private static String  removeDublicate(String str) {
       String s="";
       for(int i=0; i<str.length(); i++) {
           if(!s.contains(str.charAt(i)+"")){
               s+=str.charAt(i);
           }
       }return s;
    }
}
