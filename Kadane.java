import java.util.*;
class Kadane{

    public static int maxSum(int arr[], int n){
        int maxSum= arr[0];
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0)
            sum=0;
        } 
        return maxSum;
    }

    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int n = arr.length;
        int res = maxSum(arr,n);
        System.out.print(res);
    }
}