//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int nums[], int n)
    {
        //complete the function here
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low]<=nums[high]){
                return nums[0];  
            }
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[mid]<nums[mid-1]){ 
                return nums[mid];
            }
            else if(nums[mid]>=nums[low]){
                low = mid+1;
            }else if(nums[mid]<=nums[high]){ 
                high = mid-1;
            }
        }
        return -1;
    }
}
