/*K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}. 
The difference between 
the largest and the smallest is 8-3 = 5.*/
 
import java.util.*;
class Que9{
    public static void main(String args[]){
        int arr[]={1,5,8,2,10};
        int k=2;
        int n=arr.length;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        for(int i=0;i<arr.length-1;i++){
            int min=Math.min(smallest,arr[i+1]-k);
            int max=Math.max(largest,arr[i]+k);
            if(min<0){
                continue;
            }
            ans=Math.min(ans,max-min);
        }
        System.out.println(ans);
    }
} 