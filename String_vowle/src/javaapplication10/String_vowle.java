/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author surya
 */
import java.util.*;
public class String_vowle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String a="This website is awesome 29292";
         a=a.toLowerCase();
         for(int i=0;i<a.length();i++)
         {
            char b=a.charAt(i);
            if(b =='a'||b =='e'||b =='i'||b =='o'||b =='u')
             {
                continue;
             }
             System.out.print(b);
         }
         
    }
    
}
