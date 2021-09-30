package test;

import java.util.Scanner;

public class ArrElementCheck {
	
	public static void main(String[] args) {
		
		int []arr= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you array element : ");
		for(int i = 0; i<5;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a number = ");
		int num = sc.nextInt();
		sc.close();
		int temp=0;
		for(int i = 0; i<arr.length;i++) {
			if(num==arr[i]) {
				System.out.println("number is present at index " +i + " Number is " +arr[i]);
				temp++;
			}
		}
		if(temp==0) {
			System.out.println("Number is not present");
		}
	}

}
