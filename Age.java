import java.util.Scanner;
  class Age
  {
    public static void main(String[] args)
    {
      int n;
      System.out.println("enetr your age:");
      Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
      if(n>=18)
      {
      System.out.println("eligible for voting");
      }
      else{
        System.out.println("no eligibility");
      }
    }
  }