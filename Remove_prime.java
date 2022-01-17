import java.util.*;
public class Remove_prime {

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer> a1 = new ArrayList<>();
      for(int i =0 ; i<n;i++){
        a1.add(sc.nextInt());
      }
      remove_prime(a1);
      System.out.println(a1);
      
    }

    public static boolean isprime(int v){
      for(int i =2; i*i <=v;i++){
        if (v%i == 0){
          return false;
        }
      }return true;
    }

     public static void remove_prime(ArrayList<Integer> arr) {
       for(int i = arr.size() -1;i>=0;i--){
         int val = arr.get(i);
         if(isprime(val)== true){
           arr.remove(i);
         }

       }
    }
    
  }