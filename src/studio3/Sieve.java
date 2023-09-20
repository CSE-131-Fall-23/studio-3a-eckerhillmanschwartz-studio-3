package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	
	System.out.println("Number n");
	int n = in.nextInt();
	
	//System.out.println(n);
	
	int mainArray[] = new int[n];
	
	for (int i = 1; i <= n; i++)
	{
		mainArray[i-1] = i;
		//System.out.println(i);
	}
	for ( int v : mainArray)
	{
		System.out.println(v);

	}
	//System.out.println(mainArray[n-1]);
	}

}
