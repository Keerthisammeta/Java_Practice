import java.util.Scanner;
class Pos
  {
    public static void main(String args[])
    {
      int n;
      System.out.println("enetr a number:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(n>0)
      {
        System.out.println("its a positive number.");
      }
      else
      {
       System.out.println("Its a negative number."); 
      }
    }
  }