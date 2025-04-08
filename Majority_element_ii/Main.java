package Majority_element_ii;

//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        
        int n = nums.length ;
        HashMap<Integer,Integer> hmp = new HashMap<Integer,Integer>();
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i< n; i++){
            
            if(hmp.containsKey(nums[i])){
                Integer key = (Integer) nums[i];
                Integer value = (hmp.get(nums[i]));
                value++;
                hmp.put(nums[i],value);
               
            }else{
               hmp.put(nums[i],1); 
            }
            
        }
        
        Iterator<Map.Entry<Integer,Integer>> it = hmp.entrySet().iterator();
        
        while(it.hasNext()){
            Map.Entry<Integer, Integer> entry = it.next();
            if(entry.getValue() >(n/3)){
                result.add(entry.getKey());
            }
        }
        
        
        
        return result;
    
        
        
        
    }
}
