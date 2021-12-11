
import java.util.*;
  
  public class GcdandLcm{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num1 = scn.nextInt();       
      int num2 =scn.nextInt();
      int n1 = num1;
      int n2 = num2;                     // gcd and lcm   
      while(num1%num2 !=0){             // divisor become small no and grater no will divident and after 
        int rem = num1%num2;           
        num1 = num2;
        num2 = rem;                     // division rem become divisor and divient become first divisor 
      }
      int gcd = num2;
      int lcm = (n1*n2)/gcd;            // while rem become 0
      System.out.println(gcd);
      System.out.println(lcm);
      }
   }
  