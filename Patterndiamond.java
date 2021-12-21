
import java.util.*;
  
  public class Patterndiamond{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sp = n/2;
      int s = 1;
      for (int i =0;i<n;i++){
        for(int j = 1;j<=sp;j++){
          System.out.print(" ");
        }
        for(int k =1; k<= s;k++){
          System.out.print("*");
        }
        if (i < n/2){
          sp -=1;
          s +=2;
        }else{
          sp +=1;
          s -=2;
        }System.out.println();
        }

      }
   }
   