package p2020.p20201108;

import java.util.Scanner;

public class P2748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] arr = new long[n + 1];
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		System.out.println(arr[n]);

	}
}
