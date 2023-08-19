import java.util.*;



public class inbuiltSort{
     public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] ={5,4,1,3,2};
        Arrays.sort(arr);
        // Arrays.sort(arr,0 ,3) 0 = starting index 3 = ending index ending index is non-inclusive
        //Arrays.sort(arr, 0 ,3) output will be (1,4,5,3,2)
        printArr(arr);
    }
}