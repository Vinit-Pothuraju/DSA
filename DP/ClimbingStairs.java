import java.util.*;
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        System.out.println(funT(n));   
    }
    // Recursive Memo Space;
    // in this recursive calling the the function goes in the linear way hence 
//  time complexity will bigO(n) and dp array of bigO(n);
    public static int func(int n,int dp[]){
        if(n==1){
            return n;
        }
        if(dp[n]!=0) return dp[n];
        return dp[n]=func(n-1, dp)+func(n-2, dp);
    }
    // Tabulation  ;
    //  for loops runs in the n  time so tc will bigO(n);
    // space complexity(bigO(n));
    public static int  fun(int n,int dp[]){
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    // Tabulation with space:
// Time complexity will be O(n) but constant space;
    public static int  funT(int n){
        int a=0;
        int b=1;
        
        for(int i=2;i<=n;i++){
           int temp=a+b;
           a=b;
           b=temp;
        }
        return b;
    }

}
