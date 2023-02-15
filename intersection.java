import java.util.*;
public class intersection{

    static void intersect(int a[], int b[]){

        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> hi = new HashSet<Integer>();
        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        int temp =0;
        for(int i=0; i<b.length; i++){

            if(hs.contains(b[i])){
                hi.add(b[i]);
            }
        }
        System.out.print(hi + " ");
    }

    public static void main(String[] args){

            int[] a = {10,20,10,30};
            int [] b = {20,10,10,40};

            intersect(a,b);
        }
}