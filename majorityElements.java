import java.util.*;
class majorityElements{

    static void majorityElement(int arr[], int k){

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0;i < arr.length; i++){

            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
System.out.print(hm + "\n\n");
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            if(e.getValue() >= (arr.length/k)){
                System.out.print(e.getKey()+" ");
            }
        }
    }

    public static void main(String[] args){

        int arr[]={1,2,1,6,1,7,3,4,2,9};
        int k = 5;

        majorityElement(arr,k);
    }
}