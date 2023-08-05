import java.util.*;
class Que11{
    public static void main(String args[]){
        int arr[]={1,3,8,9,9,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}