
import java.util.Scanner;
public class Evenodd {	
	public static void main(String[] args) {		
		int n, evencount=0, oddcount=0, evensum = 0, oddsum = 0;
		double evenavg = 0, oddavg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value: ");
		n = sc.nextInt();
		int arr[] = new int[100];
		System.out.println("enter array elements : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2 == 0) {
				evencount = evencount + 1;
				evensum = arr[i] + evensum;
			}
			else {
				oddcount = oddcount + 1;
				oddsum = arr[i] + oddsum;
			}
		}
		evenavg = evensum / evencount;
		oddavg = oddsum / oddcount;
		System.out.println("even count is : " +evencount);
		System.out.println("odd count is : " +oddcount);
		System.out.println();
		System.out.println("even sum is : " +evensum);
		System.out.println("odd sum is : " +oddsum);
		System.out.println();
		System.out.println("even average is : " +evenavg);
		System.out.println("odd average is : " +oddavg);
	}

}

