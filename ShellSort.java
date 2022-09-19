import java.util.Scanner;

public class ShellSort {
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    private static void shellSort(int[] arr){
        int n = arr.length;
        for(int interval = n/2; interval>0; interval/=2){
            for(int i=interval;i<n;i++){
                int temp = arr[i];
                int j;
                for(j=i; j >= interval && arr[j-interval]>temp;j-=interval)
                    arr[j] = arr[j-interval];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args){
        System.out.print("Enter the length of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\n Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Given Array: ");
        printArray(arr);
        shellSort(arr);
        System.out.print("Sorted Array: ");
        printArray(arr);
        sc.close();
    }
}
