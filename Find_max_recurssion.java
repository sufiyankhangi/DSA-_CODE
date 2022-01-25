import java.util.*;
public class Find_max_recurssion {

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter lenght of array");
      int n = sc.nextInt();
      int arr[]= new int[n];
      System.out.println(" enter your array");
      for(int i =0 ; i <n; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println(findmax(arr, 0));
    }
    public static int findmax(int[] arr, int idx){
      if (idx == arr.length -1){
        return idx;
      }
      int max = findmax(arr, idx+1);
      if (arr[idx]> max){
        return arr[idx];
      }else{
        return max;
      }
    }


  }