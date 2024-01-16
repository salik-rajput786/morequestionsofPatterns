package PracticesQuesionofPattern;
/* 
     
*   *
**  **
*** ***
*******
*******
*** ***
**   **
*     *
 
 */
import java.util.Scanner;

public class ninetheenthquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        int nsp =n;
        int nsp1=1;
        for(int i=1; i<=n;i++){
            for(int j =1;j<=i-1;j++){
                System.out.print("*");
            }
            for(int j =1; j<=nsp;j++){
                System.out.print(" ");
            }
            nsp--;
            for(int j =1;j<=i-1;j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
        for(int j=1;j<=2*n-1;j++){
            System.out.print("*");
        }
        System.out.println();
        for(int j=1;j<=2*n-1;j++){
            System.out.print("*");
        }
        System.out.println();

        for(int i=1; i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j =1; j<=nsp1;j++){
                System.out.print(" ");
            }
            nsp1+=2;
            for(int j =1;j<=n-i;j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    
  }
}
