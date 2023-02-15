public class negativeToOneSide{

    static void shift(int[] arr, int n){

        int count = 0;

        for(int i=0; i<n; i++){

            if(arr[i] > 0){
                int temp = arr[count];

                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }
    public static void main(String[] args){

        int[] a = {-1,2,3,-4,8,-5,6};

        shift(a, a.length);

        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}