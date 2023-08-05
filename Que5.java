//Move all the negative elements to one side of the array 
import java.util.*;
class Que5{
    public static void main(String args[]){
        int j=0, temp;
        int arr[]={-92,93,74,-83,74};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
                
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}