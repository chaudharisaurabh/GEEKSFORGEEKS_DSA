package Second_Largest;

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        
        int largest =arr[0];
        int smallest = -1;
    
        
        int i =1;
       while(i < arr.length){
           
           if(arr[i] > largest)
           {
            smallest = largest;
            largest = arr[i];
            
           }else{
               if(smallest < arr[i] && arr[i] != largest){
                   smallest = arr[i];
               }
           }
           
           
           i++;
       }
        
        return smallest;
        
        
        
        
    }
}