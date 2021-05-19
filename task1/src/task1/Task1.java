/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author surya
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String a="surya football player and surya is  dancer";
      
       String c[]=a.split(" ");
       System.out.println(c.length);
       for(int i=0;i<c.length;i++)
       {
          int count=1;
            
           for(int j=i+1;j<c.length;j++)
           {
               if(c[i].equals(c[j]))
               {
               count= 1+count;
               
               System.out.println(c[i]+"  =  "+count);
             
               }
              
           }
       }
       
    }
    
}
