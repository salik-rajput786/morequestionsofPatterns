package PracticesQuesionofPattern;

import java.util.Scanner;

/*
A
A B
A B C
A B C D
 */
public class thirdquestion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a n ");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(64+j)+" ");

            }
            System.out.println(" ");
        }
    }
}
