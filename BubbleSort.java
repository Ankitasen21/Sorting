import java.util.*;

public class BubbleSort{
    void printArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
class Solution{
    public static void main(String[] args) {
        System.out.println("Enter the length of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort b = new BubbleSort();
        System.out.print("Given Array: ");
        b.printArray(arr);
        b.bubbleSort(arr);
        sc.close();
    }
}