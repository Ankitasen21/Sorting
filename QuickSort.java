import java.util.Scanner;

public class QuickSort {
    void printArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    void quickSort(int[] arr, int beg, int end){
        if(beg<end){
            int p = partition(arr,beg,end);
            quickSort(arr, beg, p-1);
            quickSort(arr,p+1,end);
        }
    }

    private int partition(int[] arr, int beg, int end){
        int pivot = arr[end];
        int i = beg -1;
        for(int j = beg; j<=end-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
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
        QuickSort b = new QuickSort();
        System.out.print("Given Array: ");
        b.printArray(arr);
        b.quickSort(arr,0,n-1);
        System.out.print("Sorted Array: ");
        b.printArray(arr);
        sc.close();
    }

}
