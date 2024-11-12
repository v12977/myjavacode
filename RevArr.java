import java.util.*;
public class RevArr {
    public static void reverseArr(int arr[]){
        int start=0,end=arr.length-1;
        while(start<end){
            //swap
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,8};
        reverseArr(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(+arr[i]);
        }
        System.out.println(" ");

    }
    

    
}
