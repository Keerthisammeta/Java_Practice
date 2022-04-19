import java.util.*;
class Sum_Natural
  {
    public static void main(String args[])
    {
      int i=1,n,sum=0;
      System.out.println("enter n value:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=n)
        {
          sum=sum+i;
          i++;
        }
      System.out.println(sum);
    }
  }