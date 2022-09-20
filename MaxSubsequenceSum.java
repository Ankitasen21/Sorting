/* package codechef; // don't place package name! */

import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
public class MaxSubsequenceSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] ar = new int[n];
            for(int i=0;i<n;i++)
                ar[i]=sc.nextInt();
		    if(k==0)
		        System.out.println(0);
		    else{
                Arrays.sort(ar);
    		    for(int i=0;i<k;i++){
                    if(ar[i]<0){
    		            ar[i]*=-1;
                    }
                }
                Arrays.sort(ar);
                int sum = 0;
                for(int i=n-1;i>=0;i--)
                    if(sum < (sum + ar[i]))
                        sum += ar[i];
                System.out.println(sum);
    		}
	    }
        sc.close();
	}
}

