/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author surya
 */
public class largest3number {

    static void largest3number(int arr[],int arr_size)
    {
         
        int i,first,second,thrid;
        if(arr_size<3)
        {
            System.out.println("Invalid input");
            return;
        }
        thrid=first=second=Integer.MIN_VALUE;
        for(i=0;i<arr_size;i++)
        {
            if(arr[i]>first)
            {
                thrid=second;
                second=first;
                first=arr[i];
                
            }
            else if(arr[i]>second)
            {
                thrid=second;
                second=arr[i];
                
            }
            else if(arr[i]>thrid)
            {
                thrid=arr[i];
            }
            
        }
        System.out.println("three largest number:"+first+"  "+second+"   "+thrid);
    }
    public static void main(String[] args) {
      int arr[]={23,45,43,11,23,33};
      int a=arr.length;
      largest3number(arr,a);
    }
    
}
