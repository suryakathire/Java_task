/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author surya
 */
 class Inherit {

    
  
        int id=101;
        public void add(int i,int j)
        {
            int k=i+j;
            System.out.println(k);
        }
}
class Inheritance extends  Inherit
{
    
  
    public static void main(String[] args) {
        Inherit obj=new Inherit();
        obj.add(5,4);
    }
    
}
