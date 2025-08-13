import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50};
        int dp[]=new int[arr.length+1];
        Arrays.fill(dp, -1);
        int minCost=funJump(arr.length-1,arr,dp);
        System.out.println(minCost);

    }
    public static int funJump(int idx,int arr[]){
        if(idx==0){
            return 0;
        }
        int oneStep=funJump(idx-1,arr)+Math.abs(arr[idx]-arr[idx-1]);
        int twoStep=Integer.MAX_VALUE;
        if(idx>1){
            twoStep=funJump(idx-2,arr)+Math.abs(arr[idx]-arr[idx-2]);
        }
        return Math.min(oneStep,twoStep);
    
    }
    // memo
    public static int funJump(int idx,int arr[],int dp[])
    {
        if(idx==0){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        int onestep=funJump(idx-1,arr,dp)+Math.abs(arr[idx]-arr[idx-1]);
        int twostep=Integer.MAX_VALUE;
        if(idx>1){
            twostep=funJump(idx-2,arr,dp)+Math.abs(arr[idx]-arr[idx-2]);
        }
        return dp[idx]=Math.min(onestep,twostep);
    }


    // Tabulation  ;
    //  public static int funJump(int idx,int arr[],){
    //     if(idx==0){
    //         return 0;
    //     }
    //     int oneStep=funJump(idx-1,arr)+Math.abs(arr[idx]-arr[idx-1]);
    //     int twoStep=Integer.MAX_VALUE;
    //     if(idx>1){
    //         twoStep=funJump(idx-2,arr)+Math.abs(arr[idx]-arr[idx-2]);
    //     }
    //     return Math.min(oneStep,twoStep);
    // }
}
