package PracticesQuesionofPattern;
import java.util.*;
/**
1
1 2
1 2 3
1 2 3 4
 */
public class eighthquestion {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n : ");
    int n = sc.nextInt();
    for (int  i = 1; i <=n; i++) { 
       for (int  j = 1; j <=i; j++) {
        System.out.print(j+" ");
    }
    System.out.println(" ");
}
}
    
}