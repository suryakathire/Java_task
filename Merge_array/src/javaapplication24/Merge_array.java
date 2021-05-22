//merge array
package javaapplication24;

/**
 *
 * @author surya
 */
public class Merge_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a[]={1,2,3};
         int b[]={4,5,7};
         int d[]=new int[a.length+b.length];
         for(int i=0;i<a.length;i++)
         {
             d[i]=a[i];
         }
         for (int i=0;i<b.length;i++)
         {
             d[a.length+1]=b[i];
         }
         System.out.println("merge array is:");
         for(int i=0;i<d.length;i++)
         {
             System.out.println(d[i]);
         }
         
    }
    
}
