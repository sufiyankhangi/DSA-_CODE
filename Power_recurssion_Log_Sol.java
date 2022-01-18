import java.util.*;
public class Power_recurssion_Log_Sol {

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      fun(n,m);
      System.out.println(fun(n,m));
    }

    public static int fun(int v,int g){
      if(g==0){
        return 1;
      }
      int nm = fun(v,g/2);
      int po = nm*nm;
      if(g%2 == 1){
        po*=v;
      }
      return po;
    }
    
  }