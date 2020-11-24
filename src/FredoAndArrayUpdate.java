import java.util.Scanner;

public class FredoAndArrayUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int element: arr) {
			sum = sum+element;
		}
		int result = 0;
		for(int i=n; i>0; i--) {
			if(n*i > sum) {
				result = i;
			}
		}
		System.out.println(result);
	}
}
