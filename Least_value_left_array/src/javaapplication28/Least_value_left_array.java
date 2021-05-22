 
package javaapplication28;

 import java.util.*;
import java.util.Arrays;
public class Least_value_left_array {

     static void segrate(int a[],int n)
     {
         int count=0;
         for(int i=0;i<n;i++)
         {
             if(a[i]==0)
             {
                 count++;
             }
         }
         for(int i=0;i<count;i++)
         {
             a[i]=0;
         }
         for(int i=count;i<n;i++)
         {
             a[i]=1;
         }
         
     }
     static void print(int arr[],int n)
     {
         System.out.println("Array after is");
         for(int i=0;i<n;i++)
         {
             System.out.println(arr[i]+" ");
         }
     }
     
    public static void main(String[] args) {
        
        int arr[]=new int[]{0,1,0,1,1,0};
        int n=arr.length;
        segrate(arr,n);
        print(arr,n);
        
        
    }
    
}
