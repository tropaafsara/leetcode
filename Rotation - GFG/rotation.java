//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int ans =0;
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high - low) /2;
            if(mid-1>=0&&arr[mid]<arr[mid-1]){
            ans = mid;
            break;
            }
        else if(arr[mid]>arr[high])
          low=mid+1;
        else 
           high=mid-1;
        }
        return ans;
        
    }
}