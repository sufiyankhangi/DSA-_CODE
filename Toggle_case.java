import java.util.*;
public class Toggle_case {

    public static void main(String[] args){
      String s1 = "pepCODing";
      solution(s1);
      System.out.println(solution(s1));
      
    }
    

    public static String solution(String str) {
      StringBuilder sb = new StringBuilder(str);

      for(int i =0;i<sb.length();i++){
        char ch1 = sb.charAt(i);
        if(ch1 >= 'a' && ch1 <= 'z'){
          char upc = (char)(ch1 -'a'+ 'A');
          sb.setCharAt(i,upc);
        }else if(ch1 >= 'A' && ch1 <= 'Z'){
          char lc = (char)(ch1 -'A'+ 'a');
          sb.setCharAt(i,lc);
        
      
      // 'p' - 'a' = 'P'-'A'
      }
    }return sb.toString();
    
  }}