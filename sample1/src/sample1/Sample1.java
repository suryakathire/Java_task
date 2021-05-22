/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample1;

/**
 *
 * @author surya
 */
public class Sample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String a ="This is my country";
       int count=0;
       for(int i=0;i<a.length();i++)
       {
       if (a.charAt(i)!= ' ')
           {
               count++;
           }
            
       }
       System.out.println("total no of char:"+count);
       System.out.println("total no of length:"+a.length());
       String c[]=a.split(" ");
       System.out.println(c.length);
       
    }
    
    
}
