import java.util.Scanner;

public class SelectionSort {
    
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\n Enter the elements of array: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("\n Array before sorting: ");
        printArray(arr);
        selectionSort(arr);
        System.out.print("\n Array after sorting: ");
        printArray(arr);
        sc.close();
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minPos = smallest(arr,i);
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    private static int smallest(int[] arr,int i) {
        int min= i;
        for(int j=i+1;j<arr.length;j++)
            if(arr[j]<arr[min])
                min=j;
        return min;
    }
}
