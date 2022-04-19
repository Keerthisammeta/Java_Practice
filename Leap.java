import java.util.Scanner;
class Leap
  {
    public static void main(String[] args)
    {
      long n;
      System.out.println("enter the year:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextLong();
      if(n%4==0) 
         {
           System.out.println("its a leap year.");
         }
      else if(n%400==0)
      {
        System.out.println("its a leap year");
      }
      else
      {
         System.out.println("not a leap year");
      }
    }
  }