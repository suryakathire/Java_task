// SINGLE DIMENTIONAL ARRAY FIND THE SMALL AND LARGEST NUMBER IN THE ELEMENT
package javaapplication19;

/**
 *
 * @author surya
 */
public class Find_min_max_singleD {

    
    public static void main(String[] args) {
        int a[]={20,50,50,11,40,3};
        int max=a[0], min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
           
        }
         System.out.println("the largest value is:"+max);
            System.out.println("the smallest value is:"+min);
    }
    
}
