package PracticesQuesionofPattern;

import java.util.Scanner;

/*

 *
 **
 ***
 ****
 ***
 **
 *
 */
public class fifthquestion {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a n : ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
            for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <n+1-i ; k++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
