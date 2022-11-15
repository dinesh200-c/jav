import java.util.Scanner;
class MaxSum {
	
	public static int maxSum(int num[],int size) {
		int evensum=0, oddsum = 0;
		for(int i=0;i<size;i++) {
			if(num[i] % 2 == 0) {
				//System.out.println("even");
				evensum = evensum + num[i];
			}
			else {
				//System.out.println("odd");
				oddsum = oddsum + num[i];
			}
		}
		if(evensum > oddsum) {
			System.out.println(evensum);
		}
		else {
			System.out.println(oddsum);
		}
		return size;		
	}
	public static void main(String[] args) {
		int arr[] = new int[100];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		System.out.println("enter array elements : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		if(n < 0) {
			System.out.println("invalid");
		}
		else {
			maxSum(arr, n);
		}
	}

}
