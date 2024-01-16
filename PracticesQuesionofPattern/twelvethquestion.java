package PracticesQuesionofPattern;
/*
 *    A
    B A  B
  C B A  B C
 D C B A  B C D
 */
import java.util.Scanner;

public class twelvethquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i ++){
            for(int j =1; j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print((char)(64+j)+" ");

            }
            for(int k =i-1; k>=1;k--){
                System.out.print((char)(k+64)+" ");
            }
            System.out.println(" ");
        }
    }
    }
