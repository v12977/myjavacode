// import java.util.*;
// public class Matrix {
//     public static boolean Search( int matrix[][], int key){
//         for(int i=0;i<matrix.length;i++){//use for row(always go firstly in row)
//             for(int j=0;j<matrix[0].length;j++){//use for coloum becuse of row loop 2nd loop coloum
//                 if(matrix[i][j]==key){

//                    System.out.println("found at index=(" +i+" , "+j+")");
//                        return true;
                

//                 }
//             }

//         }
//         return false;

//     }
//     public static void main(String[] args){
//         int matrix[][]=new int[3][3];//creation of matrix
//         int n=matrix[0].length,m=matrix.length;
//         Scanner sc=new Scanner(System.in);// this line use for input
//         for(int i=0;i<m;i++){//use for row(always go firstly in row)
//             for(int j=0;j<n;j++){//use for coloum becuse of row loop 2nd loop coloum
//                  matrix[i][j] = sc.nextInt();
//                 System.out.println();

//             }
//         }
//         //now code for output
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(matrix[i][j] + "");
//             }
//         System.out.println();

//         }
//         Search(matrix,5);

//     }
    
        
// }


public class Matrix{
    public static int findlargest(int matrix[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        return max;

    }

    public static void main(String[] args){
        int matrix[][]=new int [3][3];
        for(int i=0;i<matrix.length;i++){
                        for(int j=0;j<matrix[0].length;j++){
                            System.out.print(matrix[i][j] + "");
                        }
                    System.out.println();
            
                    }
                    findlargest(matrix);
            
                }

    }

