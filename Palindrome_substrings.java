import java.util.*;
public class Palindrome_substrings {

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s1 = sc.next();
      solution(s1);
    }
    public static boolean ispalindrome(String s) {
      int i =0 ;
      int j = s.length()-1;
      while(i<=j){
        char ch1 = s.charAt(i);
        char ch2 = s.charAt(j);
        if(ch1 != ch2){
          return false;
        }else{
          i++;
          j--;
        }
      }
      return true;
    }


    public static void solution(String str) {
      for(int i =0;i<str.length();i++){
        for(int j = i+1;j<=str.length();j++ ){
          String ss = str.substring(i, j);
          if(ispalindrome(ss) == true){
            System.out.println(ss);
          }
        }
      }
    }
  }