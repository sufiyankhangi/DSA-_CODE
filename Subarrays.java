
import java.util.*;

public class Subarrays {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int arra [] = new int [n];
    String arra[]={"a","b","c","d"};
    // for(int i =0; i<arra.length;i++){
    //   arra[i]=scn.nextInt();
    // }
    for(int k=0;k<arra.length;k++){
    for(int i=k;i<arra.length;i++){
      for(int j=k;j<=i;j++){
        System.out.print(arra[j]);
      }System.out.println();
    }
  }
     }
  }