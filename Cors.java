import java.util.Scanner;
import java.lang.Math;
class Cors
  {
    public static void main(String args[])
    {
      char ch;
      System.out.println("enter the character:");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
      if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
      {
         System.out.println("it is a alphabet");
      }
      else if (ch >= 48 && ch <= 57)
      {
         System.out.println("it is a digit");
      }
      else 
      {
        System.out.println("it is a special character");
      }
    }
  }