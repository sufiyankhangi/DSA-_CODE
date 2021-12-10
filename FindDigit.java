import java.util.*;
  
  public class FindDigit{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t  = sc.nextInt();
      int g = t;
      int count =0;
      while(t!=0){
        t= t/10;
        count++;

      }
      int div = (int)Math.pow(10, count-1);
      while(div !=0){
        int q = g/div;
        g =g%div;
        div=div/10;
        System.out.println(q);
      }

      }

  
   }
  