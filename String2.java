import java.util.*;
class String2{
    public static void main(String args[]){
        String str1="abcd";
        String str2="cdab";
        if(str1.length()==str2.length()){
            String combine=str1+str1;
            if(combine.contains(str2)){
                System.out.println("Given strings are rotation to each other ");
            }
        }
    }
}
