package PracticesQuesionofPattern;

import java.util.Scanner;

/*
 
 */
public class twentiethquestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter  n : ");
        int n = sc.nextInt();
        int nsp =1;
        int nsp1=n*2-4;
        for(int i = 1;i<=2*n-1;i++)
        {
            System.out.print("*");
        }
        System.out.println();
       // System.out.println();
       for(int i=n-1; i>=1;i--){
                for (int j=1;j<=i;j++){
                 System.out.print("*");
            }
            for(int j =1; j<=nsp;j++){
                System.out.print(" ");

            }
            nsp+=2;
            
           
                for (int j=1;j<=i;j++){
                     System.out.print("*");
                }

            System.out.println(" ");

         }
          
        for(int i=2; i<=n-1;i++){
            for (int j=1;j<=i;j++){
                 System.out.print("*");
            }
           
            for (int j = 1; j<nsp1; j++) {
                System.out.print(" ");
            }  
            nsp1-=2;
                for (int j=1;j<=i;j++){
                     System.out.print("*");
                }
                System.out.println(" ");
            }

                for(int i = 0;i<2*n-1;i++)
                {
                    System.out.print("*");
             
                   }
       }  
     }
        


       