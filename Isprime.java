import java.util.*;
  
  public class Isprime{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t  = sc.nextInt();
  
       for(int i =0; i<t;i++){
           int n = sc.nextInt();

           int count = 0;
           for(int div=2;div*div<=n;div++){       // used square method
               if (n%div == 0){
                   count++;
                   break;         // used break for only one comaprison
               }
           }
           if(count == 0){
               System.out.println("prime no");
           }else{
               System.out.println("not prime");
           }
       }
  
   }
  }
