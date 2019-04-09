/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.projects;

/**
 *
 * @author akshay.kawale
 */
public class FindPrimeNumbers {

    public static void main(String[] args) {
        System.out.print("Prime numbers between 1 to 100 is: ");

        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) 
                    break;
                 else 
                    System.out.print(i + " ");
                }
        }
    }
}
