import java.util.Scanner;

public class HeapSort {
    
    void printArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    

    void heapSort(int[] arr){
        int n = arr.length;
        buildMaxHeap(arr,n);
        for(int i=n-1;i>=0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr,i,0);
        }
    }

    private void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2*i +1;
        int r = 2*i +2;
        if(l < n && arr[l]>arr[largest])
            largest = l;
        if(r < n && arr[r]>arr[largest])
            largest = r;
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, n, largest);
        }
    }

    private void buildMaxHeap(int[] arr, int n) {
        for(int i=n/2 -1;i>=0;i--)
            maxHeapify(arr, n, i);
    }


    public static void main(String[] args) {
        System.out.println("Enter the length of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HeapSort b = new HeapSort();
        System.out.print("Given Array: ");
        b.printArray(arr);
        System.out.print("Sorted Array: ");
        b.heapSort(arr);
        b.printArray(arr);
        sc.close();
    }
}
