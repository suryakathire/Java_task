/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author surya
 */
public class Replace_str {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String a= "Gandhi was born in 1969. Gandhi was from gujarat.";
         String b=a.replaceAll("Gandhi","mahatma");
         System.out.println("original :"+a);
         System.out.println("replace:"+b);
         
    }
    
}
