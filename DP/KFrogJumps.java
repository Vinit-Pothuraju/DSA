public class KFrogJumps {
    public static void main(String[] args) {
        int heights[]={15, 4, 1, 14, 15};
        int k=3;
        int n = heights.length;
        System.out.println(f(n-1,heights,k)) ;
    }

    public static int f(int i ,int[] arr,int k){
        if(i == 0){
            return 0;
        }
        int mini = Integer.MAX_VALUE;
        
        for(int j = 1 ; j<=k  && i-j>=0 ; j++){
            mini = Math.min(Math.abs(arr[i]-arr[i-j]) + f(i-j,arr,k),mini);
         
        }
        return mini;
    }
}
    


