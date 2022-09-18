import java.util.Scanner;

public class CountingSort {
    
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

    void countingSort(int[] arr){
        int max = getMax(arr);
        int[] count = new int[max+1];
        int[] res = new int[arr.length];
        for(int i=0;i<count.length;i++)
            count[i] =0;
        for(int i=0;i<arr.length;i++)
            count[arr[i]]++;
        for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
        for(int i=0;i<arr.length;i++){
            int j = count[arr[i]]-1;
            res[j] = arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++)
            arr[i]=res[i];
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
        CountingSort b = new CountingSort();
        System.out.print("Given Array: ");
        b.printArray(arr);
        System.out.print("Sorted Array: ");
        b.countingSort(arr);
        b.printArray(arr);
        sc.close();
    }
}
