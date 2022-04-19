import java.util.Scanner;
class Dayswtch
{
  public static void main(String args[])
  {
  int n;
  System.out.println("enter a value between 1 to 7:");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
    switch(n)
    {
      case 1:
        System.out.println("its monday");
          break;
          
        case 2:
        
          System.out.println("its tueseday");
          break;
        
        case 3:
        
          System.out.println("its wednesday");
          break;
        
        case 4:
        
          System.out.println("its thursday");
          break;
        
        case 5:
        
          System.out.println("its friday");
          break;
        
        case 6:
        
          System.out.println("its saturday");
          break;
        
        case 7:
        
          System.out.println("its sunday");
          break;
        
        
    }
   
    }
  
  
}