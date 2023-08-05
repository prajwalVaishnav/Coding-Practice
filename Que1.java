//Reverse the array 

import java.util.*;
class Que1{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n=sc.nextInt();
    
    int arr[]=new int[n];
    for(int i=0; i<n;i++){
        arr[i]=sc.nextInt();
    }
    int l=arr.length;
    int arr2[]=new int[n];
    

    for(int i=0;i<n;i++){
        arr2[i]=arr[l-1];
        l--;
        System.out.println(arr2[i]+ " ");
    }
   
    }

}