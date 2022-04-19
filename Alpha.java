import java.util.Scanner;
class Alpha
  {
    public static void main(String[] args)
    {
     
       char ch;
      System.out.println("enter an alphabet:");
      Scanner sc=new Scanner(System.in);
       ch=sc.next().charAt(0);
      if(ch=='a'|| ch=='A')
      {
        System.out.println("alphabet is vowel");
      }
      else if(ch=='e' || ch== 'E')
      {
        System.out.println("alphabet is vowel");
      }
      else if(ch=='i' || ch== 'I')
      {
        System.out.println("alphabet is vowel");
      }
      else if(ch=='o'||ch=='O')
      {
        System.out.println("alphabet is vowel");
      }
      else if(ch=='u'||ch=='U')
      {
        System.out.println("alphabet is vowel");
      }
      else
      {
        System.out.println("alphabet is consonant");
      }
      
    }
  }