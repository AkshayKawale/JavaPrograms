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
public class Evennum
{
	public static void main(String[] args)
	{
	    System.out.print("Even numbers between 1 to 100 is: ");
	    
	    for(int i = 1; i <= 100; i++)
	    {
	        if(i % 2 == 0)
	            System.out.print(i + " ");        
	    }
	}
}