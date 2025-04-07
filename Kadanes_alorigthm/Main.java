package Kadanes_alorigthm;

//{ Driver Code Starts
// Initial Template for Java

// The steps are as follows:

// We will run a loop(say i) to iterate the given array.
// Now, while iterating we will add the elements to the sum variable and consider the maximum one.
// If at any point the sum becomes negative we will set the sum to 0 as we are not going to consider it as a part of our answer.

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.maxSubarraySum(arr));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;
        
        for(int i =0; i<n; i++){
            
         sum = sum + arr[i];
         
         maxSum = Math.max(sum,maxSum);
         
         if(sum<0){
            sum =0; 
         }
        }
        
        return (maxSum);
        
    }
}
