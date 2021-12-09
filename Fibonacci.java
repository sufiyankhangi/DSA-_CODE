import java.util.*;
  
  public class Fibonacci{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t  = sc.nextInt();
      int a = 0 ;
      int b= 1;
      for(int i =0;i<t;i++){
        System.out.print(" "+a);
        int c = a + b;
        a = b;
        b= c;
      }

  
   }
  }