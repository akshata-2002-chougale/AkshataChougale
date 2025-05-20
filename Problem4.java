
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0; i<n; i++) {
			ar[i]=sc.nextInt();
		}
			
		int[] count=new int[10];
		for(int i=0; i<n; i++) {
			for(int j=1; j<=9; j++) {
				if(ar[i]%j==0) {
					count[j]++;
				}
			}
		}
		for(int i=1; i<=9; i++) {
			System.out.println(i + ":" + count[i]);
		}
	}

}
