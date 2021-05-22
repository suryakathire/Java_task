 //STRING BUFFER AND BULIDER METHODS
package javaapplication12;

 
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s="hi hello";
       StringBuffer sb =new StringBuffer(s);
       System.out.println(sb.append(" bye"));
       System.out.println(sb.insert(2,"friends"));
       System.out.println(sb.delete(0, 2));
      System.out.println(sb.deleteCharAt(3));
      System.out.println(sb.reverse());
    }
    
}
