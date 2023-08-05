//Kedanes Algorithm
/*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.*/
/*N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray*/

import java.util.*;
class Que12{
    public static void main(String args[]){
        int arr[]={1 ,2 , 3, -2, 5};
        int sum=0;
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            maxi=Math.max(maxi,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Sum of contiguous subArray is : "+ maxi);
    }
}