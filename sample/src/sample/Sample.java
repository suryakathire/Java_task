/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author surya
 */
public class Sample {

 
    public static void main(String[] args) {
        String a= "sbl it soloutions!!!!";
        String b="WELCOME";
        System.out.println("upper case is: "+a.toUpperCase());
        
        System.out.println("lower case is:"+a.toLowerCase());
        
        System.out.println(a.charAt(4));
         
        System.out.println(a.indexOf("s"));
          
        System.out.println(a.trim());
           
        System.out.println(a.length());
            
        System.out.println(a.substring(4 ,9));
             
        System.out.println(a.concat(b));
        
        if(a.equals(b))
        {
            System.out.println("bith are equal");
        }
        else
        {
            System.out.println("not equal");
        }
        
        String c[]=a.split(" ");
        System.out.println(c.length);
        for(int i=0;i<c.length;i++)
        {
        System.out.println("------->"+c[i]);
        }
    }
   }
