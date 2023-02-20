public class SortArrayOfZeroOneAndTwo{

    static void sort(int a[], int n){
        int s=0, mid=0, e= n-1;

        while(mid<=e){

            if(a[mid] == 0){
                int temp = a[mid];
                a[mid] = a[s];
                a[s] = temp;
                s++;
                mid++;
            }

            else if(a[mid] == 2){
                int temp = a[mid];
                a[mid] = a[e];
                a[e] = temp;
                e--;
            }

            else if(a[mid]== 1)
                mid++;

        }
    }

    public static void main(String[] args){
        int a[]= {1,1,0,0,0,2,1,0,2,2,0,2,0,1,0,1,2,0,2};
        sort(a,a.length);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}