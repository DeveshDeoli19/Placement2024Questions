import java.util.*;
public class union{

    static void uni(int a[], int b[]){

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        for(int i=0; i<b.length; i++){

            hs.add(b[i]);
        }
        System.out.print(hs + " ");
    }

    public static void main(String[] args){

            int[] a = {10,12,15};
            int [] b = {18,12};

            uni(a,b);
        }
}