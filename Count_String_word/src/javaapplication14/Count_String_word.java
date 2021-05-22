 //WORD REVERSEING WITHOUT REVERSE METHOD
package javaapplication14;

 public class Count_String_word {

  
    public static void main(String[] args) {
        String w="hi hello everyone thankyou";
        String b[]= w.split(" ");
        for(int i=b.length-1;i>=0;i--)
        {
        System.out.println(b[i]);
    }
        
        System.out.println(b.length);
    }
    
}
