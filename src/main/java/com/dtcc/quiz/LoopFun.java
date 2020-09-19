package com.dtcc.quiz;

import java.util.Scanner;

public class LoopFun {
    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
    Scanner input = new Scanner(System.in);

    public Integer factorial(Integer number) {
      if(number == 1){
          return 1;
      }else
        return number * factorial(number - 1);
}

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        String line = " ";
        System.out.print("Enter a phrase to get the acronym: ");
        phrase = input.nextLine();

        for (int i = 1; i <= phrase.length() -1; i++){
           if(phrase.charAt(i-1) == ' '){
               line += phrase.toUpperCase().charAt(i);
           }
        }
        return line;
    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
       // char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            String str = " ";
           char c;
           int a = 3;
           word = input.next();
        for (int i = 0; i < word.length(); i++){
            c = (char) ((word.charAt(i))+ a);
            if(c > 'z'){
                str += (char)(word.charAt(i) - (26 - a));
            }else{
                str += (char)(word.charAt(i) + a);
            }
        }
        return str;
    }

}

