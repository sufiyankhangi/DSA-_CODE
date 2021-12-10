import java.util.*;
  
  public class ReverseDigit{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int g  = sc.nextInt();
      while(g >0){
        int q = g%10;
        g =g/10;
        System.out.println(q);
      }
      }
   }
  