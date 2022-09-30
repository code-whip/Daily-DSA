import java.util.*;
import java.lang.*;
import java.io.*;

public class MergingTwoSortedHalf
{
	public static void main (String[] args) throws java.lang.Exception
    {
      Scanner it = new Scanner(System.in);
      int n = it.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++)
        arr[i]= it.nextInt();

      SortTwoSortedArray(arr, n); // merging function
      
    }
  
  public static void SortTwoSortedArray(int[] arr, int n) {
    boolean isSorted = true;
    // checking array is already sorted or not
    int midIndex=0;
    for(int index=0; index< n-1; index++) {
      if(arr[index]>arr[index+1]) {
        isSorted=false;
        midIndex=index+1;
      }
    }
    if(isSorted==true){
      for(int s=0; s< n; s++)
      System.out.print(arr[s]+" ");
      return;
    }
      
    int i=0; // itereating for left half
    int j=midIndex; // itereating for right half
    int k=0; // iterating for sorted array
    int[] sorted = new int[n];
    
    while( i< midIndex && j<n) {
      if(arr[i]<arr[j])
        sorted[k++]=arr[i++];
      else
        sorted[k++]=arr[j++];
    }
    // for the remaining elements of arr
    while(i< midIndex)
      sorted[k++]=arr[i++];
    
    while(j<n)
      sorted[k++]=arr[j++];

    //  in the end printing the full sorted array
    for(int s=0; s< n; s++)
      System.out.print(sorted[s]+" ");
  }
  
}
