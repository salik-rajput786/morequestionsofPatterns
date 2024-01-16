package PracticesQuesionofPattern;

import java.util.Scanner;

/*
 *    A
    A B C
   A B C D E
 A B C D E F G
 */
public class elventhquestion {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print((char)(64+j)+" ");
                
            }
            System.out.println(" "+" ");
        }
           
        }
    
}
