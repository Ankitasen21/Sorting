/*
    There are N horses in the stable. The skill of the horse i is represented by an integer S[i]. The Chef needs to pick 2 horses for the race such that the difference in their skills is minimum. This way, he would be able to host a very interesting race. Your task is to help him do this and report the minimum difference that is possible between 2 horses in the race.

    Input:
    First line of the input file contains a single integer T, the number of test cases.
    Every test case starts with a line containing the integer N.
    The next line contains N space separated integers where the i-th integer is S[i].

    Output:
    For each test case, output a single line containing the minimum difference that is possible.

    Constraints:
    1 ≤ T ≤ 10
    2 ≤ N ≤ 5000
    1 ≤ S[i] ≤ 1000000000
 */

import java.util.Scanner;

public class RaceHorse {
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] s = new int[n];
            for(int i=0;i<n;i++)
                s[i] = sc.nextInt();
            sort(s);
            int min = s[1] - s[0];
            for(int i=1;i<n-1;i++)
                if((s[i+1] - s[i])<min)
                    min = s[i+1] - s[i];
            System.out.println(min);
        }
        sc.close();
    }
}
