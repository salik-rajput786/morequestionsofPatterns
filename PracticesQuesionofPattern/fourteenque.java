package PracticesQuesionofPattern;
/*
 1 2 3 4 3 2 1
 1 2 3   3 2 1
 1 2       2 1
 1           1
 */
// THIS CODE WILL WORK FOR 1 TO 10 NUMBER ONLT 
// SO GET N= 1 TO 10 ONLY 
import java.util.Scanner;

public class fourteenque {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        int nsp=1;
        for (int i = 1; i <=n; i++) {
            System.out.print(i);
        }
        for (int i = n-1; i>=1; i--) {
            System.out.print(i);
        }
        System.out.println();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
            System.out.print(j);
            }
            for(int j=0;j<nsp;j++){
            System.out.print(" ");
            }
            nsp+=2;
            for(int j=n-i;j>=1;j--){
            System.out.print(j);
            }
            System.out.println();
            }
    }
    }
    

