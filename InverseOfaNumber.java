import java.util.*;
  
  public class InverseOfaNumber{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      int nw =0;
      int count =1;
      while(t!=0){
        int rem = t%10;
        nw = count * (int)Math.pow(10,rem -1)+ nw;
        t =t/10;
        count ++;
      } System.out.println(nw);
      }
   }
  