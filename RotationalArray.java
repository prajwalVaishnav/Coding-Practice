import java.util.*;
class RotationalArray{
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5};
        int arr2[]={4,5,1,2,3};
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
       
        for(int i=0;i<arr1.length;i++){
            list1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            list2.add(arr2[i]);
        }
        list1.addAll(list2);
        if(list1.isSublist(list2)){
            System.out.println("Yes");
        }
        


        }
}