/*
    CodeChef Sorting Problem 1: The smallest pair sum
    problem:
    You are given a sequence a1, a2, ..., aN. F
    ind the smallest possible value of ai + aj, where 1 ≤ i < j ≤ N.
    
    Input
    The first line of the input contains an integer T denoting the number of test cases. 
    The description of T test cases follows. 
    The first line of each description consists of a single integer N.
    The second line of each description contains N space separated integers - a1, a2, ..., aN respectively.

    Output
    For each test case, output a single line containing a single integer - 
    the smallest possible sum for the corresponding test case.
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

public class smallestPairSum{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a;
        int m1, m2;
                  
        while(t-- > 0) {
            int n = sc.nextInt();
            m1 = Integer.MAX_VALUE; 
            m2=Integer.MAX_VALUE;
            System.out.println(m1+" "+m2);
            for (int i = 0; i < n; i++) {
                a = sc.nextInt();
                if(a < m1) {
                    m2 = m1;
                    m1 = a;
                } else if(a >= m1 && a < m2) {
                    m2 = a;
                }
                System.out.println(m1+" "+m2);
            }
            System.out.println(m1 + m2);
        }

        sc.close();
    }
}