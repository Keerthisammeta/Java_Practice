import java.util.*;
class Even_Sum
  {
    public static void main(String args[])
    {
      int i=2,n,sum=0;
      System.out.println("enter a value:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=n)
        {
          sum=sum+i;
          i=i+2;
        }
      System.out.println(sum);
    }
    
  }