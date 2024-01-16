package PracticesQuesionofPattern;
/*
   *
  * *
 *   *
*     *
*     *
 *   *
  * *
   *
 */
import java.util.Scanner;

public class sixteenthquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  n : ");
        int n = sc.nextInt();
        int nsp = n - 1;
        int nsp1 = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < nsp1; j++) {
                System.out.print(" ");
            }
            nsp1--;
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");

                } else
                    System.out.print(" ");
            }
            System.out.println();

        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print("*");
                } else
                    System.out.print(" ");

            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            nsp--;
            for (int j = 1; j <= n; j++) {
                if (i + j == n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");

            }

            System.out.println();
        }
    }

}
