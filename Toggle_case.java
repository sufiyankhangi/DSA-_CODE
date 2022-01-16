import java.util.*;
public class Toggle_case {

    public static void main(String[] args){
      String str = "peping";
      System.out.println(solution(str));
      
    }
    

    public static String solution(String str) {
      StringBuilder sb = new StringBuilder();
      sb.append(str.charAt(0));

      for(int i =1;i<str.length();i++){
        char ch1 = str.charAt(i);
        char ch2 = str.charAt(i-1);
        int ch = ch1 - ch2;
        sb.append(ch);
        sb.append(ch1);
      
      // 'p' - 'a' = 'P'-'A'
      }return sb.toString();
    }
    
  }