package test;
import java.util.Scanner;

public class ArrSum {
	
	public static void main(String[] args) {
		int sum= 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of element = ");
		int n = sc.nextInt();
		
		int [] ar = new int[n];
		System.out.println("Enter your element : ");
		for(int i = 0; i<n; i++) {
			ar[i] = sc.nextInt();
			
			sum= sum + ar[i];
			
		}
		System.out.println(sum);
		sc.close();
		
	}

}
