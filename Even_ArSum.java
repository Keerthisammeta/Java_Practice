import java.util.*;
class Even_ArSum
  {
    public static void main(String args[])
    {
      int sum=0,i;
      int a[]=new int[10];
      System.out.println("enter elements:");
      Scanner sc=new Scanner(System.in);
      for(i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("sum is:");
      for (i=0;i<5;i++)
        {
          if(a[i]%2==0)
          {
            sum=sum+a[i];
          }
        }
      System.out.println(sum);
      
    }
  }