package PracticesQuesionofPattern;
/*
1
2 1
3 2 1
4 3 2 1
 */
import java.util.Scanner;

public class ninthquestion {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n : ");
    int n = sc.nextInt();
   
    for (int  i = 1; i <=n; i++) { 
   
        for (int k = i-1+1; k >=1; k--) {
            System.out.print(k+" ");
        }      
       System.out.println(" ");
           
    }
   
}
}

