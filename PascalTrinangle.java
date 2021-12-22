
import java.util.*;

import javax.swing.plaf.synth.SynthLookAndFeel;
  
  public class PascalTrinangle{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      for (int i =0;i<n;i++){
        int icj =1;
        for(int j=0; j<=i;j++){
          System.out.print(icj);
          int icjp = icj*(i-j)/(j+1); //  formula   {pep coding pattern 13}  remind this formula
          icj = icjp;
          }System.out.println();
        }
       
      }
   }
        //    PASCAL TRiangle