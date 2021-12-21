
import java.util.*;
  
  public class PatternHollowdiamond{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sp = 1;
      int s = (n/2)+1;
      for (int i =0;i<n;i++){
        for(int k =1; k<= s;k++){
          System.out.print("*");
        }
        for(int j = 1;j<=sp;j++){
          System.out.print(" ");
        }
        for(int k =1; k<= s;k++){
          System.out.print("*");
        }
        if (i < n/2){
          s -=1;
          sp +=2;
        }else{
          s +=1;
          sp -=2;
        }System.out.println();
        }

      }
   }
   