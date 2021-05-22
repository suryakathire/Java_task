/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversenumber;

 import java.util.Scanner;
public class Reversenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.println("enter a number:");
          int num=scan.nextInt();
          int rev =0;
          while(num!=0)
          {
              rev =rev*10 + num%10;
              num=num/10;
          }
          
          System.out.println("reverse number is:"+rev);
                }
    
    }
    

