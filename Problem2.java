
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int count=0;
		int n=1;
		
		while(count<a) {
			System.out.print(n);
			
			if(count<a-1) {
				System.out.print(", ");
			}
			n=n+2;
			count++;
		}
		

	}

}
