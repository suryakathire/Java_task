 //REMOVING 1 ST ELEMENT FROM AN ARRAY
package javaapplication22;

/**
 *
 * @author surya
 */
public class Remove_1st_ele_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
                int arr=a[0];
                for(int i=0;i<a.length;i++)
                {
                    if(arr==a[i])
                    {
                        continue;
                    }
                   System.out.println(a[i]); 
                }
                
                
    }
    
}
