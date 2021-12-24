
import java.util.*;

public class Decimal_To_Any_Base {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueInBase(n, b);
    System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int p =1;int dt = 0;
       while(n>0){
           int rem = n%b;
           n = n/b;
           
           dt = dt + p*rem;
           p*=10;
       }
       return dt;
   }
  }