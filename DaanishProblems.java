import java.util.Scanner;

public class DaanishProblems {

	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int arr[]=new int[10];
		    for(int i=0; i<10; i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int k=sc.nextInt();
		    int c=0;
		    for(int j=9; j>=0; j--)
		    {
		        c+=arr[j];
		        if(c>k){
		            System.out.println(j+1);
		            break;
		        }
		    }
		}
        sc.close();
    }

}
