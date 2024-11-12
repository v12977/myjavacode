import java.util.*;
// public class strr {
//     public static String substring(String str,int start,int end){//initialization of function
//         String substr="";//take avariable for concatenation or store the string
//         for(int i=start;i<end;i++){
//             substr+=str.charAt(i);//defination of function
//         }
//         return substr;  
    
//     }

//     public static void main(String[] args){
//         String str="Hello Vikash";
//         System.out.println(substring(str, 0, 12));// calling of function
//     }
    
// }
public class strr {
    public static void main(String[] args){
        String fruits[]={"Banana","Apple","Orange"};
        String largest= fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);


        
    }
}
