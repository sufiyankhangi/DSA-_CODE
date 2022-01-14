import java.util.*;
public class Two_D_array_search {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int arr[][] = new int [n][m];

      for(int i=0 ;i<n;i++){
        for(int j=0;j<m;j++){
          arr[i][j]= sc.nextInt();
        }
      }

      System.out.println("finding what no.");
      int num = sc.nextInt();

      int i = 0;
      int j = m-1;

      while(i<n && j>=0){
        if(num == arr[i][j]){
          System.out.println("milgyya");
          System.err.println(i);
          System.out.println(j);
          return;
        }else if(num >arr[i][j]){
          i++;
        }else if(num <arr[i][j]){
          j--;
        }
      }
      System.out.println("nhi mila");
    }
  }