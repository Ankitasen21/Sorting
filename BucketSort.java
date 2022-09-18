import java.util.Scanner;

class BucketSort {
    
    int getMax(int[] arr){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
    void printArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    void bucketSort(int arr[]){
        int m = getMax(arr);
        int[] bucket = new int[m+1];  //total number of buckets = max element in array +1
        for(int i=0;i<=m;i++){
            bucket[i] =0; // intializing all the elements in bucket as 0 
        }
        for(int i=0;i<arr.length;i++){
            bucket[arr[i]]++;
            // incrementing only those bucket elements which match the elements in original array
        }
        printArray(bucket);
        for(int i=0,j=0;i<=m;i++){
            if(bucket[i]==1)
                arr[j++] = i; 
        }
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
        BucketSort b = new BucketSort();
        System.out.print("Given Array: ");
        b.printArray(arr);
        b.bucketSort(arr);
        b.printArray(arr);
        sc.close();
    }
}
