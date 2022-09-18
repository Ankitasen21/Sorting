import java.util.Scanner;

public class MergeSort {
    
    void printArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    void mergeSort(int[] arr, int beg, int end){
        if(beg<end){
            int mid = (beg + end)/2;
            mergeSort(arr,beg,mid); mergeSort(arr,mid+1,end);
            merge(arr,beg,mid,end);
        }
    }

    private void merge(int[] arr, int beg, int mid, int end) {
        int n1 = mid - beg +1, n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++)
            left[i] = arr[beg + i];
        for(int i=0;i<n2;i++)
            right[i] = arr[mid + 1 + i];
        int i = 0, j =0, k = beg; 
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = left[i];
            i++; k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++; k++;
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
        MergeSort b = new MergeSort();
        System.out.print("Given Array: ");
        b.printArray(arr);
        b.mergeSort(arr,0,n-1);
        System.out.print("Sorted Array: ");
        b.printArray(arr);
        sc.close();
    }
}
