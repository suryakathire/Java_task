 import java.util.*;
 class books {

    
     static String st;float prize; int bookno;
     static String str,re,b;
     static int a,c;
     char r;
     
     books getdata(String st,float prize,int bookno)
    {
        this.st=st;
        this.prize=prize;
        this.bookno=bookno;
         return null;
    }
    public void setdata()
    {
        System.out.println("your detail is :");
            System.out.println("book name:"+st);
         
              System.out.println("book_prize:"+prize);
             
             System.out.println("book_id:"+bookno);
          
               
    }
     
         public void chemistry()
        { 
            System.out.println("");
            String chem[]={"101 - java - $500","102 - python - $600","103 - bio c++ - $450"};
            System.out.println("The books available in computer science  department are as fllow ");
            for(int i=0;i<chem.length;i++)
            {
                System.out.println(chem[i]);
            }
        }
         public void physics()
            {
                System.out.println("");
            String phy[]={"201 - Machanics - $1000","202 - Dynamics_ $2000","203 - Solid state physics - $3000"};
            System.out.println("The books available in physics department are as fllow ");
            for(int j=0;j<phy.length;j++)
            {
                System.out.println(phy[j]);
            }
                
        }
          public void biology()
        {
            System.out.println("");
            String bio[]={"301 - zoology - $1450","302 - Botany - $1550","303 - medical science - $4500"};
            System.out.println("The books available in biology department are as fllow ");
            for(int k=0;k<bio.length;k++)
            {
                System.out.println(bio[k]);
            }
               
        }
          void add()
          {
              
              System.out.println("enter book name ,prize and book_no");
              Scanner obj2=new Scanner(System.in);
               st=obj2.next();
               prize=obj2.nextFloat();
               bookno=obj2.nextInt();
              //System.out.println("your detais is:book name:"+str+  "prize:"+ prize+  "book_id:"+bookno);
             
          }
          
          void iss()
          {
              Scanner obj3=new Scanner(System.in);
              System.out.println("book name");
              str=obj3.nextLine();
              System.out.println("book_id");
              a=obj3.nextInt();
             System.out.println("issue date");
             b=obj3.next();
              System.out.println("total number of book issued");
              c=obj3.nextInt();
             System.out.println("Return book date");
             re=obj3.next();
             
          }
          int getid()
          {
              return a;
              
          }
          void ret()
          {
              System.out.println("Enter student name and book_id");
              Scanner  sc=new Scanner(System.in);
              String name=sc.nextLine();
              int bookid =sc.nextInt();
              if(a==bookid)
              {
                  System.out.println("total details");
                  System.out.println("book Name:"+ str);
                  System.out.println("Book id:"+a);
                  System.out.println("issue date"+b);
                  System.out.println("total number of book issued:"+c);
                  System.out.println("book return date:"+ re);
              }
              else 
              {
                  System.out.println("wrong id, pls enter correct id ");
              }
          }
          void details()
          {
               
                  System.out.println("book Name:"+str);
                  System.out.println("Book id:"+a);
                  System.out.println("issue date"+b);
                  System.out.println("total number of book issued:"+c);
                  System.out.println("book return date:"+ re);
          }
          void exit()
          {
              System.out.println("thank you visit again and learn more...!!!");
          }
 
          
          
          
       public static void main(String[] args) {
         
           do{
           System.out.println("************ SBL'S LIBRARY **************");
           System.out.println("PRESS 1 TO ADD BOOK");
           System.out.println("PRESS 2 TO ISSUE BOOK");
           System.out.println("PRESS 3 TO RETURN A BOOK");
           System.out.println("PRESS 4 TO PRINT COMPLETTE ISSUE DETAILS ");
           System.out.println("PRESS 5 TO EXIT");
           books che=new books();
           che.chemistry();
           books phy=new books();
           phy.physics();
           books bio=new books();
           bio.biology();
           System.out.println("******************************************");
           Scanner scan=new Scanner(System.in);
           System.out.println("enter any number");
           int a=scan.nextInt();
          
           switch(a)
           {
               case 1:
                   books aa=new books();
                   aa.add();
                   aa.getdata(aa.st,aa.prize,aa.bookno);
                   aa.setdata();
                   break;
               
               case 2:
                    books bb=new books();
                   bb.iss();
                   break;
               case 3:
                    books cc=new books();
                   cc.ret();
                   break;
               case 4:
                    books dd=new books();
                   dd.details();
                   break;
               case 5:
                    books ee=new books();
                   ee.exit();
                   break;
               default:
                   System.out.println("invalid number");
           }
           }
            
           while( a!=5);
                   {
                       System.out.println("thank you!!!");
                   }
           
               
           }
       }
 
        
       
           
        
               
        
          
        
            
        
        
            
 
 