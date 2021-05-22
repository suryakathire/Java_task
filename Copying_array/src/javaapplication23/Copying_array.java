//copying array
package javaapplication23;

/**
 *
 * @author surya
 */
public class Copying_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]={1,3,4,5,6};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        System.out.println("copying array is:");
        for (int i=0;i<b.length;i++)
        {
            System.out.print(" "+b[i]);
        }
        
    }
    
}
