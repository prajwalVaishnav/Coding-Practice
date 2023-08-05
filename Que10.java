aimport java.util.*;
class Que10{
    public static void main(String args[]){
        int arr[]={1,3,5,8,9,2,6,7,6,8,9};
        int jump=0;
        int farthest=0;
        int current=0;
        for(int i=0;i<arr.length;i++){
            farthest=Math.max(farthest,arr[i]+i);
            if(i==current){
                current=farthest;
                jump++;
            }
        }
        System.out.println(jump);
    }
}