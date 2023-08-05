import java.util.*;
class Que18{
    public static void main(String args[]){
        int arr1[]={1, 5, 10, 20, 40, 80};
        int arr2[]={6, 7, 20, 80, 100};
        int arr3[]={3, 4, 15, 20, 30, 70, 80, 120};
        //Finding common elements from all three arrays
        ArrayList<Integer> List=new ArrayList<>();
        HashSet<Integer> s1= new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            if(!s1.contains(arr1[i])){
                s1.add(arr1[i]);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(!s2.contains(arr2[i])){
                s2.add(arr2[i]);
            }
        }
        for(int i=0;i<arr3.length;i++){
            if(s1.contains(arr3[i]) && s2.contains(arr3[i]) && !List.contains(arr3[i])){
                List.add(arr3[i]);
            }
        }

        System.out.println("Common elements are : "+ List);
    }
}