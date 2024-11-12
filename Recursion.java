import java.util.*;
// public class Recursion {
//     public static void printdec(int n){
//         if(n==1){
//             System.out.print(n + " ");
//             return;
//         }
//         // System.out.print(n+ " ");
//         printdec(n-1);
//         System.out.print( n + " ");

//     }
//     public static void main(String[] args){
//         int n=10;
//         printdec(n);
//     }
    
// }
// public class Recursion {

// public static int sum(int n){
//     if(n==1){
//         return 1;
//     }
//     int Snm1=sum(n-1);
//     int Sn=n+Snm1;
//     return Sn;
// }
// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     // int n=40;
//     System.out.print(sum(n));
// }
// }



public class Recursion {

//    public static boolean issorted(int arr[],int i){
//        if(i==arr.length-1){
//           return true;
//          }
//       if(arr[i]>arr[i+1]){
//           return false;
//         }
//        return issorted(arr, i+1);
//     }
//       public static void main(String[] args){
//           int arr[]={1,2,3,4,5};
//           System.out.println(issorted(arr, 0));
//         }
// }

//1st occurrence

// public static int searchfirst(int arr[] , int i,int key){
//     if(i==arr.length-1){
//         return -1;
//     }
//     if(arr[i]==key){
//         return i;
//     }
//     return searchfirst(arr, i+1, key);


// }
// public static void main(String[] args){
//     int arr[]={1,2,3,4,5};
//     int key=4;
//     System.out.println(searchfirst(arr,  0,4));
// }


// }

//power
// public static int power(int x, int n){
//     if(n==0){
//         return 1;
//     }
//     return x*power(x,n-1);
// }
// public static void main(String[] args){
//     System.out.println(power(2,3));
// }
// }

//tilling problem
// public static int tilefilling(int n){
//     if(n==0 || n==1){
//         return 1;
//     }
    // vertical
    // int fNm1=tilefilling(n-1);
    // horizontal
//     int fNm2=tilefilling(n-2);

//     int totalways= fNm1+fNm2;
//     return totalways;
// }
// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     System.out.print(" entre the width="); 
//     int n=sc.nextInt();
//     System.out.print(" total number of tile is=");

//     System.out.println(tilefilling(n));
// }
// }


// Pairing
public static int friendpair(int n){
    if(n==1 || n==2){
        return n;
    }
    //single choice
   int  Fnm1=friendpair(n-1);
    // double pair
   int  Fnm2=friendpair(n-2);
   int pairway=(n-1)*Fnm2;
    int tWay=Fnm1+pairway;
    return tWay;
}
public static void main(String[] args){
    System.out.println(friendpair(3));


}
}