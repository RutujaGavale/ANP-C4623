package array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingStringExample
{
	public static void main(String[] args) 
	{
		//Scanner class used to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int s=sc.nextInt();
		String[] arr=new String[s];
		System.out.println("Enter the array element:");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextLine();
		}
       Arrays.sort(arr);
       System.out.println("Sorted array:");
      for(String i:arr)
      {
    	  System.out.print(i+" ");
      }
     
	}

}
