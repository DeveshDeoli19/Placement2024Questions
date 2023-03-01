import java.util.*;
class findSubSet{

    static boolean isSubSet(int arr[],int temp[]){

        int n = temp.length;

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0; i<arr.length; i++){
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],1);
                else{
            hm.put(arr[i], hm.get(arr[i])+1);
            }
        }

    for(int i=0; i<n; i++){
        if((hm.containsKey(temp[i])) && hm.get(temp[i])!=0){
            hm.put(temp[i], hm.get(temp[i])-1);
        }
        else{
            return false;
        }
    }
        System.out.print(hm);
        return true;
    }

    public static void main(String[] ar){
        int arr[] = {1,2,3,4,1,2};
        int temp[] = {1,1,1};
       boolean f = isSubSet(arr,temp);
        System.out.print(f);
    }
}