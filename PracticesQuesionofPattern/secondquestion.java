package PracticesQuesionofPattern;
/*
1 2 3 4
1 2 3
1 2
1
 */

import java.util.Scanner;

public class secondquestion {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a n : ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n+1-i; j++) {
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }
}
