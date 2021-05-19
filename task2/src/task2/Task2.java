/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Tinemplates
 * and open the template in the editor.
 */
package task2;

 import java.util.*;
public class Task2 {

     
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter the age");
         int age= scan.nextInt();
         if(age<18)
         {
            
             System.out.println("not eligible to vote...");
         }
         else if(age>18 && age<=60)
         {
             System.out.println("Eligible to vote...");
         }
         else if(age>60)
         {
             System.out.println("senior voter");
         }
          
         
         
    }
    
}
