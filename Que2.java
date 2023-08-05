//Maximum and minimum element from an array
import java.util.*;
class Que2{
    public static void main(String args[]){
        int arr[]={4, 5, 9, 1, 28};
        int l=arr.length;
        int max=0;
        int min=0;
        Arrays.sort(arr);
        max=arr[l-1];
        min=arr[0];
        System.out.println("Maximum element is : "+ max);
        System.out.println("minimum element is : "+ min);
    }
}