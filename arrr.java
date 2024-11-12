 import java.util.*;

 public class arrr{
    public static void bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
        public static void printArr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
     
  
    public static void main(String[] args){
        int arr[]={3,2,6,4,8,1};
        bubblesort(arr);
        printArr(arr);
        // System.out.println(arr);
        // System.out.println("the sorted arr is="+arr);
    }
    
 }