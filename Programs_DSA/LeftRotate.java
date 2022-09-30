import java.util.*;
import java.lang.*;
import java.io.*;

public class LeftRotate
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner scn = new Scanner(System.in);
                short N = scn.nextShort();
                int arr[] = new int[N];
                for(short i=0; i<N; i++)
                        arr[i] = scn.nextInt();
                short K = scn.nextShort();
                // left rotation : step 1 reverse whole arr
                reverse(arr,0,N-1);
                // step 2: reverse left part, range[0,N-1-K]
                reverse(arr,0,N-1-K);
                // step 3: reverse right part, range[N-K,N-1]
                reverse(arr,N-K,N-1);

                for(short i=0; i<N; i++){
                        System.out.print(arr[i]+" ");
                }
	}
        public static void reverse(int[] arr, int start, int end)
        {
                while(start<end)
                        {
                                int temp = arr[start];
                                arr[start] = arr[end];
                                arr[end] = temp;
                                start++;
                                end--;
                        }
        }
}
