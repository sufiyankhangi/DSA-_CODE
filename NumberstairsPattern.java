
import java.util.*;
  
  public class NumberstairsPattern{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sp = 2*n -3;
      int s = 1;
      
      for (int i =1;i<=n;i++){
        int val =1;
        for(int l=1;l<=s;l++){
          System.out.print(val);
          val++;
        }
        for(int j =1;j<=sp;j++){
          System.out.print(" ");
        }
        if ( i == n) //Last Row check
      {
        s--;val--;
      }
        for(int l=1;l<=s;l++){
          val--;System.out.print(val);
          
        }
        sp -=2;
        s+=1;
        System.out.println();
        }
      }
   }
        //    PASCAL TRiangle