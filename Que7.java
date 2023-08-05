//Cylindrical array
import java.util.*;
class Que7{
    public static void main(String args[]){
        int arr[]={82,81,63,10,39};
        int l=arr.length;
        int arr2[]=new int[l];
        arr2[0]=arr[l-1];
        for(int i=1;i<l;i++ ){
            arr2[i]=arr[i];
        }
        for(int i=0;i<l;i++){
            System.out.println(arr2[i]+" ");
        }

    }
}