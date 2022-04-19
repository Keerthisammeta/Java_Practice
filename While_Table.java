import java.util.*;
class While_Table
  {
    public static void main(String args[])
    {
      int i=1,n,mul;
      System.out.println("enter a number:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=10)
      {
        mul=n*i;
        System.out.println(n+"*"+i+"="+mul);
        i++;
      }
        
    }
  }