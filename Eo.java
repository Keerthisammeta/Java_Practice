import java.util.Scanner;
class Eo
  {
    public static void main(String args[])
    {
      int n;
      System.out.println("enetr a number:");
      Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
      if(n%2==0){
        System.out.println("its an even number");
      }
      else{
        System.out.println("its an odd number");
      }
    }
  }