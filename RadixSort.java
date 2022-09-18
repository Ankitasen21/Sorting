import java.util.Scanner;

public class RadixSort {
    
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

    void countingSort(int[] arr, int n, int place){
        int[] count = new int[10];
        int[] res = new int[n+1];
        for(int i=0;i<n;i++)
            count[(arr[i]/place)%10]++;
        for(int i=1;i<10;i++){
            count[i] += count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            res[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0;i<arr.length;i++)
            arr[i]=res[i];
    }

    void radixSort(int arr[]){
        int max = getMax(arr);
        int n = arr.length;
        for(int place =1;max/place >0;place*=10){
            countingSort(arr,n,place);
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
        RadixSort b = new RadixSort();
        System.out.print("Given Array: ");
        b.printArray(arr);
        System.out.print("Sorted Array: ");
        b.radixSort(arr);
        b.printArray(arr);
        sc.close();
    }
}
