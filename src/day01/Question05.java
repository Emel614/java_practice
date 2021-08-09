package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question05 {
     /*
Write a method that takes two parameters:
an ArrayList of Strings called wordList, and a String called targetWord.
Method removes the targetWord from ArrayList.
EX :ArrayList("hi","hey","hi","yo"));  ----> removeAll(wordList,"hi"); --->["hey","yo"].
		 */
     public static void main(String[] args) {
      ArrayList<String> list =  new ArrayList<String>(List.of("hi","hey","hi","yo"));
         System.out.println(removeAll(list,"hi"));

     }
     public static ArrayList<String> removeAll(ArrayList<String> list,String str){
         for(int i=0; i<list.size(); i++){
             if(list.get(i).equals(str)){
                 list.remove(list.get(i));
                 i--;
             }
         }return list;
     }
}
