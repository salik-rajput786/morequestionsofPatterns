package PracticesQuesionofPattern;

import java.util.Scanner;

/*
 ******
 * *
 * *
 ******
 */
public class sixthquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                }
                else {
                    if (j==1 ||j==2) {
                    System.out.print("*");
                    }
                }
                
              
            }
              System.out.println(" ");
        }
    }
    }
