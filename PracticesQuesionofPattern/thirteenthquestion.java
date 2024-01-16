package PracticesQuesionofPattern;

/*
   A B C D E F G
   A B C   E F G
   A B       F G
   A           G
 */
import java.util.Scanner;

public class thirteenthquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n*2-1;i++){
          System.out.print((char)(i+64) +" "); 
   }
  
   System.out.println();
   n--;
   int nsp =1;

      for (int i = 1; i <=n; i++) {
        char a=65;
       
       for(int j=1;j<=n+1-i;j++){
       System.out.print(a++ +" ");
       }
       
         for(int j=1;j<=nsp;j++){
           System.out.print(" " +" ");     
            a++;
   }
   
      nsp+=2;
      
     
      for(int j=1;j<=n+1-i;j++){
        System.out.print(a++ +" ");
       
        }
      
       System.out.println(" "+" ");
    }
    }
}
