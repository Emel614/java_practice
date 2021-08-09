package day01;

public class Question01 {
    /*
     * Write method that accepts a String and extracts letters and numbers.
     *  Method should return a String.
     *  EX: a1b2c3 --> Letters are abc and numbers are 123.
     */
    public static void main(String[] args) {
        String str="a1b2c3";
        extractLetterAndNumber(str);
    }

    public static void extractLetterAndNumber(String str) {
        String letter = "";
        String number = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letter += str.charAt(i);
            }
            if (Character.isDigit(str.charAt(i))) {
                number += str.charAt(i);
            }
        }
        System.out.println("Letters are= " + letter);
        System.out.println("Numbers are= " + number);
    }
}