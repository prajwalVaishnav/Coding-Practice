//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
import java.util.*;
class Que4{
    public static void main(String args[]){
        int arr[]={0,1,2,1,0,2,0};
        int count1=0, count2=0, count3=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count1++;
            }
            else  if(arr[i]==1){
                count2++;
            }
            else{
                count3++;
            }
        }
        if(count1!=0){
        for(int i=0;i<count1;i++){
            arr[i]=0;
        }
        }
        if(count2!=0){
        for(int i=count1;i<count1+count2;i++){
            arr[i]=1;
        }
        }
        if(count3!=0){
        for(int i=count1+count2;i<count1+count2+count3;i++){
            arr[i]=2;
        }
        }

         for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
        }
    }

   
    
}