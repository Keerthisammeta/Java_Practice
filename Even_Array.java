import java.util.*;
class Even_Array
  {
    public static void main(String args[])
    {
      int i;
      int a[]=new int[10];
      System.out.println("eneter elements:");
      Scanner sc=new Scanner(System.in);
      for(i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("even elements are");
      for(i=0;i<5;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]);
          }
        }
    }
  }