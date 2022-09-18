import java.util.Scanner;

public class CombSort {

    void printArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    int updateGap(int gap){
        gap = (gap * 10)/13;
        if(gap < 1)
            return 1;
        return gap;
    }
    void combSort(int[] arr){
        int gap = arr.length;
        int swapped = 1;
        while(gap!=1 || swapped == 1){
            gap = updateGap(gap);
            
            swapped = 0;
            for(int i=0;i<arr.length-gap;i++){
                if(arr[i]>arr[i+gap]){
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;
                    swapped = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("COMB SORT-- ");
        System.out.println("Enter the length of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        CombSort b = new CombSort();
        System.out.print("Given Array: ");
        b.printArray(arr);
        b.combSort(arr);
        b.printArray(arr);
        sc.close();
    }
}
