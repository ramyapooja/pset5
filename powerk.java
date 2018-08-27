import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static boolean powerof(int n,int k)
	{
		if(n==0)
		{
	              return false;
		}
		while(n!=1)
		{
		   if(n%2!=0)
		   {
		     return false;
	               }
		   n=n/k;
		}
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		if(powerof(n,k))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
