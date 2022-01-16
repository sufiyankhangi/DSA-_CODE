import java.util.*;
public class Permutation_string_loops {

    public static void main(String[] args){
      String str = "abc";
      int n = str.length();
      int num = permutation(n);
      
      
      for(int i=0;i<num;i++){
        StringBuilder sb = new StringBuilder(str);
        int temp =i;
        for(int j=n;j>0;j--){
          int r = temp%j;
          int q = temp/j;
          System.out.print(sb.charAt(r));
          temp =q;
          sb.deleteCharAt(r);
        }System.out.println();
      }
      
    }
     public static int permutation(int n) {
       int val =1;
       for(int i =2; i<=n;i++){
         val*=i;
       }
      return val;
    }
    
  }