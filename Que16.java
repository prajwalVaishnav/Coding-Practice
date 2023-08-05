/*Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/

import java.util.*;
class Que16{
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        int maxProfit=0;
        int minSoFar=arr[0];
        for(int i=0;i<arr.length;i++){
            minSoFar=Math.min(minSoFar,arr[i]);
            int profit=arr[i]-minSoFar;
            maxProfit=Math.max(maxProfit,profit);
        }
        System.out.println("Maximum profit is : "+ maxProfit);

    }
}