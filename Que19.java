/*Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.*/
class Que19{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
       HashSet<Integer> hash=new HashSet<>();
       int sum=0;
       hash.add(sum);
       for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
           if(hash.contains(sum)){
               return true;
           }
           else{
               hash.add(sum);
           }
       }
       return false;
    }
}