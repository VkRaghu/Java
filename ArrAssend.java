package test;
import java.util.*;

public class ArrAssend {
	
	public static void main(String[] args) {
		
		
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter the number of element you want : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter your element : ");
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}sc.close();
		System.out.print("You entered : ");
		for(int i : arr) {
			System.out.print(i +" ");
		}
		for(int i = 0; i<arr.length;i++) {
			for(int j = i;j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("");
		System.out.print("In Assending array is : ");
		for(int i : arr) {
			System.out.print(" "+i);}
	}

}
