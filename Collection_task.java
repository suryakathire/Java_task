package collection_task;
import java.util.*;
public class Collection_task {
public static void main(String[] args) {
         ArrayList <Integer>a=new ArrayList<>();
         ArrayList <Integer>b=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        b.add(22);
        b.add(40);
        b.add(30);
        b.add(40);
        b.add(50);
         //addall means append one list to another list 
         a.addAll(b);
         System.out.println("append"+a);
         System.out.println(a);
         //insert value
         a.add(2,45);
         System.out.println("insert the value:"+a);
         //remove value
         a.remove(1);
         System.out.println("remove the value is:"+a);
         
        //size of the array
         
         System.out.println("size of the array:"+a.size());
         
         //get the value
         System.out.println("get the value:"+a.get(3));
         
         //set the value
         a.set(2,90);
         System.out.println("set the value:"+a);
         
         //sort the value
         Collections.sort(a);
         Collections.reverse(a);
         System.out.println("sort in reverse"+a);
         //equals
         System.out.println("equal:"+a.equals(b));
         //isempty or not
         
         System.out.println("empty or not:"+a.isEmpty());
         //System.out.println("contains:"+a.contains(b));
         //hash code return hashcode value
         System.out.println("hashcode is"+a.hashCode());
         
          // sublist take the index value of the array
         System.out.println("sub list:"+ a.subList(0,4));
            //first index and last index
        System.out.println("first index:"+ a.indexOf(10));
         System.out.println("last index:"+a.lastIndexOf(20));
          
    }
    
}
