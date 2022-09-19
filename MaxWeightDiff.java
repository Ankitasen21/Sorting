import java.util.Scanner;

public class MaxWeightDiff {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] >= arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] s = new int[n];
            for (int i = 0; i < n; i++)
                s[i] = sc.nextInt();
            sort(s);
            int sumChefBag = 0;
            int sumSonBag = 0;
            if (k <= n / 2) {
                for (int i = 0; i < k; i++) {
                    sumSonBag += s[i];
                }
                for (int i = k; i < n; i++)
                    sumChefBag += s[i];
            }
            else{
                for(int i=0;i<n-k;i++)
                    sumSonBag += s[i];
                for(int i=n-k;i<n;i++)
                    sumChefBag += s[i];
            }
            System.out.println(sumChefBag - sumSonBag);
        }
        sc.close();
    }
}
