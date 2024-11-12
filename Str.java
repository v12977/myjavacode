import java.util.*;
// public class Str{
//     public static void printstring(String str){
//         for(int i=0;i<str.length();i++){
//             System.out.print(str.charAt(i)+" ");

//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         char arr[]={'a','b','c','d'};//it is type of declaration of String
//         String str="abcd";//it is type of declaration of String
//         String str2=new String("xyz");//it is type of declaration of String
//         System.out.println(str);
//         System.out.println(str2);
//         System.out.println(arr);

//         // Scanner sc= new Scanner(System.in);
//         // String name;
//         // name=sc.next();
//         // System.out.println(name);
//         System.out.println(str2.length());
        
//         System.out.println(str.length());
//         String full=str+ " " +str2;//concatanation of string
//         System.out.println(full);
//         System.out.println(str.charAt(1));//print index wise value 
//         printstring(str);//print all letter of string by using function

//     }
// }
public class Str{
    public static float shortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dire=path.charAt(i);
            //East
            if(dire=='E'){
                x++;
            }
            else if(dire=='W'){//West
                x--;
            }
            else if(dire=='N'){//North
                y++;
            }
            else{//South
                y--;
            }


            }
        
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    
    public static void main(String[] args){
        String path="WEENENS";
        System.out.print(shortestpath(path));

    }
}




