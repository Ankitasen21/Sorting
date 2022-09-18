import java.util.Scanner;

public class InsertionSort {
    
    void printArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && temp<=arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args){
        System.out.println("Enter the length of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        InsertionSort b = new InsertionSort();
        System.out.print("Given Array: ");
        b.printArray(arr);
        b.insertSort(arr);
        System.out.print("Sorted Array: ");
        b.printArray(arr);
        sc.close();
    }
}
