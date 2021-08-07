/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanWordBeCreatedFromOtherWord;

import java.util.Scanner;

/**
 *
 * @author axfor
 */
public class CanWordBeCreatedFromOtherWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String Word1 = input.nextLine();

        System.out.println("Enter second word:");
        String Word2 = input.nextLine();

        char[] Letters = Word2.toCharArray();

        int matchingletters = 0;

        for (int i = 0; i < Word1.length(); i++) {
            for (int j = 0; j < Letters.length; j++) {
                if (Letters[j] == Word1.charAt(i)) {
                    matchingletters++;
                    Letters[j] = ' ';
                    break;
                }
            }
        }

        if (matchingletters == Word1.length()) {
            System.out.println("First word can be created form second word");
        } else {
            System.out.println("First word cannot be created form second word");
        }
    }

}
