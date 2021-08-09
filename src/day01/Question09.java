package day01;

public class Question09 {
    /*
     * Write a method that checks if word is palindrome.
     * A palindrome is a word, number, phrase, or other sequence of characters which
     *  reads the same backward as forward, such as madam or racecar or
     *  the number 10801.
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
    public static boolean isPalindrome(String str){
        for(int i=0,j=1; i<str.length()/2; i++,j++){
            if(str.charAt(i)!=str.charAt(str.length()-j)){
                return false;
            }
        }return true;
    }
}
