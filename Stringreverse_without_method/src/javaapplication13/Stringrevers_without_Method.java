 //STRING USING REVERSE METHOD AND WITHOUT REVERSEING STRING
package javaapplication13;

 
public class Stringrevers_without_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String rev="wow";
        StringBuffer in=new StringBuffer(rev);
        System.out.println(in.reverse());
        
        String re="madam";
        char b[]=re.toCharArray();
    
    for(int i=b.length-1;i>=0;i--)
    {
       System.out.print(b[i]);
    }
    
}
}