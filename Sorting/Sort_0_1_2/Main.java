package Sorting.Sort_0_1_2;

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        
        HashMap<Integer, Integer> hmp = new HashMap<Integer,Integer>();
        
        hmp.put(0,0);
        hmp.put(1,0);
        hmp.put(2,0);
        for(int i=0; i<arr.length; i++){
            
            if(hmp.containsKey(arr[i]) ){
                
                Integer val = hmp.get(arr[i]);
                val++;
                hmp.put(arr[i], val++);
            }else{
                hmp.put(arr[i], 1);
            }
            
        }
        
        
        Integer count0 = hmp.get(0);
        Integer count1 = hmp.get(1);
        Integer count2 = hmp.get(2);
        
        //System.out.println(count0);
        //System.out.println(count1);
        //System.out.println(count2);
        
        
        int j =0;
        
        while(j < arr.length){
            //arr[j]=0;
            if(count0 >0 ){
              
                arr[j]= 0;
                count0--;
                j++;
                continue;
            }
            
            if(count1 >0 && (count0 ==0 )){
                
                arr[j]= 1;
                count1--;
                j++;
                continue;
            }
            
            if(count2 > 0 && (count0 == 0) && (count1 ==0 )){
               
                arr[j]= 2;
                count2--;
                j++;
                continue;
            }
            j++;
            
        }
        
        
        
    }
}


//{ Driver Code Starts.
// } Driver Code Ends