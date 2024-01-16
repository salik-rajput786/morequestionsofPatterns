package PracticesQuesionofPattern;
/*
 *       *
*      *
*    *
*
 */
import java.util.Scanner;
 
public class fifteenthquestion {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row number ");
        int n = sc.nextInt();
         int nsp=n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==j){
                    System.out.print("*" );
                }
               else System.out.print(" ");
                
            }
              for(int j =1;j<=nsp;j++){
                System.out.print(" ");
              }
              nsp--;
            for (int j = 1; j <= n; j++) {
                if (i+j==n){
                    System.out.print("*");
                }
               else System.out.print(" ");
                
            }
           
            System.out.println();
        }
    }
}
