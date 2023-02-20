public class peakElement{

    static int getPeak(int a[],int n)
    {
        int low=0, high = n-1;

        while(low <= high){

            int mid = (low+high)/2;

            if((mid==0 || a[mid-1] <= a[mid]) && (mid==n-1 || a[mid+1]<=a[mid]))
                return mid;
            
            else{

                if(a[mid-1]>= a[mid]){
                    high = mid-1;//move left side of array
                }

                else{
                    low= mid+1;//move right side of array
                }

            }
        }
        return -1;
    }


    public static void main(String[] args){

        int a[] = {50,10,17,15,27,3,5};
        int val = getPeak(a,a.length);
        System.out.print(a[val]);
    }
}