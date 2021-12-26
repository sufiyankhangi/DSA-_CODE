
import java.util.*;

public class Sumofarray {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int arra [] = new int [n];
    int arrb [] = new int [m];
    for(int i =0; i<arra.length;i++){
      arra[i]=scn.nextInt();
    }
    for(int i =0; i<arrb.length;i++){
      arrb[i]=scn.nextInt();
    }
    int sum []= new int [n>m?n:m];
    int max = sum.length-1;
    int a1 = arra.length-1;
    int a2 = arrb.length-1;
    int c =0;
    while(max >=0){
      int d =c;
      if (a1>=0){
        d+=arra[a1];
      }
      if (a2>=0){
        d+=arrb[a2];
      }
      c = d/10;
      d = d%10;
      sum[max]=d;
      max--;
      a1--;
      a2--;
    }
     if(c!=0){
        System.out.print(c);}
    for(int val:sum){
      System.out.print(val);
    }
     }
  }