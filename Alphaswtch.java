import java.util.Scanner;
class Alphaswtch
  {
    public static void main(String[] args)
    {
     
       char ch;
      System.out.println("enter an alphabet:");
      Scanner sc=new Scanner(System.in);
       ch=sc.next().charAt(0);
      switch(ch)
        {
          case 'a':  case 'o':
          case 'A':  case 'O':
          case 'e':  case 'u':
          case 'E':  case 'U':
          case 'i':  
          case 'I':  
        System.out.println("vowel");
            break;
          default:
        System.out.println("cosonant"); 
        }
        
    }
  }