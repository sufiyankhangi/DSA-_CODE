import java.util.*;
public class Toh {

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int th1 = sc.nextInt();
      int th2 = sc.nextInt();
      int th3 = sc.nextInt();

      fun(n,th1,th2,th3);
      System.out.println();
    }

    public static void fun(int n,int toh1,int toh2,int toh3){
      if(n==0){
        return ;
      }
      fun(n-1,toh1,toh3,toh2);
      System.out.println(n +"shift from "+ toh1 + " to "+ toh3);
      fun(n-1,toh2,toh1,toh3);
      
    }
    
  }