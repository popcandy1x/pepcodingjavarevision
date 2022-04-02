import java.util.*;

public class arrays{
	public static void main(String[] args){
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[4]=50;
		fun(arr);
		for(int val:arr){
			System.out.print(val+" ");
		}
	}
	public static void fun(int[] arr){
		arr[2]=30;
		arr[3]=40;
		// for(int i=0;i<arr.length;i++)
		// {
		// 	System.out.print(arr[i]+" ");
		// }
		// System.out.println();
	}
}