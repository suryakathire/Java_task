/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbso;

import java.util.Arrays;
public class Bbso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]={0,1,1,0,0,1,0,0,1};
                System.out.println("Array before sorting:"+Arrays.toString(a));
                int n=a.length;
                for(int i=0;i<n-1;i++) //number of rounds
                {
                    for(int j=0;j<n-1;j++) //iteration of each   pass
                    {
                        if(a[j]>a[j+1])
                        {
                            int temp=a[j];
                            a[j]=a[j+1];
                            a[j+1]=temp;
                        }
                    }
                }
                System.out.println("Array After sorting:"+Arrays.toString(a));
    }
    
}
