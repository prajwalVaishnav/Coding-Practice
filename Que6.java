//Union of two arrays
import java.util.*;
class Que6{
    public static void main(String args[]){
        int arr1[]={14,73,92,10};
        int arr2[]={14,15};
        int l=arr1.length;
        int m=arr2.length;
        int arr3[]=new int[l+m];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<l;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}