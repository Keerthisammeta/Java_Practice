/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;
 class TransposeMatrix 
  {
//Define the main method
  public static void main(String args[])
    {
//Declare the variables
      int r,c,i,j;
      int t[][]=new int[10][10];
      int a[][]=new int[10][10];
      Scanner sc=new Scanner(System.in);
//Take input from user to enter rows and column values
      System.out.println("Enter row size:");
      r=sc.nextInt();
      System.out.println("Enter column size:");
      c=sc.nextInt();
      System.out.println("enter array elements:");
      for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("array elements are");
      for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
      
//Convert the square matrix into transpose
      for(i=0;i<r;i++)
       {    
         for(j=0;j<c;j++)
          {    
            t[i][j]=a[j][i];  
          }    
       }    
 
System.out.println("Printing original Matrix:");  
      for(i=0;i<r;i++)
       {    
        for(j=0;j<c;j++)
        {    
          System.out.print(a[i][j]+" ");    
        }    
        System.out.println();  
       }    

//Print the transpose matrix
System.out.println("PrintingTranspose matrix:");  
      for(i=0;i<r;i++)
      {    
        for(j=0;j<c;j++)
        {    
          System.out.print(t[i][j]+" ");    
        }    
      System.out.println();   
      }          
//printing j and i instead of i and j
      }
  }  
