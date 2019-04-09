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
class FindMaxNumArray 
{ 
     static int arr[] = {10, 324, 45, 90, 118}; 
       
     
     public int largest() 
     { 
         int i; 
           
         
         int max = arr[0]; 
         
         for (i = 1; i < arr.length; i++) 
             if (arr[i] > max) 
                 max = arr[i]; 
        
         return max; 
     } 
       
     public static void main(String[] args)  
     { 
         System.out.println("Largest number in array is:  " + largest()); 
        } 
 } 