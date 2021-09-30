package test;
import java.util.*;

public class ArrMin {
	
	public static void main(String[] args) {
		
		
		int  n;
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of elements : ");
		n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter your Array Element : ");
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int i : arr) {
			System.out.println(i);
		}
		sc.close();
		int min = arr[0];
		
		for(int i = 0; i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Min value is : "+min);
	}

}
