import java.util.*;
class Negative_Count
  {
    public static void main(String args[])
    {
      int count=0,i;
      int a[]=new int[10];
      System.out.println("enter elements:");
      Scanner sc=new Scanner(System.in);
      for(i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("num of -ve nums are:");
      for(i=0;i<5;i++)
        {
          if(a[i]<0)
          {
            count++;
          }
        }
      System.out.println(count);
    }
  }    