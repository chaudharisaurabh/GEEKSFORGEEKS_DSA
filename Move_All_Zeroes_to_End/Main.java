package Move_All_Zeroes_to_End;

//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr);
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        
        
        
        int sp = 0;
        int fp = sp+1;
        
        
        while( sp < arr.length && fp < arr.length){
            
            if(arr[sp] == 0 ){
                
                if(arr[fp] ==0){
                    fp++;
                    continue;
                }else{
                    // logic to swap 
                    int temp = arr[sp];
                    arr[sp]= arr[fp];
                    arr[fp] = temp;
                    sp ++;
                    fp++;
                }
                
                
            }else{
                sp++;
                fp++;
            }
            
        }
    }

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
