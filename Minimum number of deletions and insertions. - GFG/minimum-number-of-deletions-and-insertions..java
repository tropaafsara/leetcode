//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int lcs(String s1, String s2, int n, int m){
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    int ans1 = dp[i][j-1];
                    int ans2 = dp[i-1][j];
                    dp[i][j]=  Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
	public int minOperations(String word1, String word2) 
	{ 
	    // Your code goes here
	    int del= word1.length()-lcs(word1,word2,word1.length(),word2.length());
        int ins= word2.length()-lcs(word1,word2,word1.length(),word2.length());
        return del+ins;
	} 
}