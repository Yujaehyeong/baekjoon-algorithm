package p2021.p05.p07;

import java.util.Scanner;

public class P1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int dp [] = new int [number+1];

		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + 1;
			if (i%3 == 0) dp[i] = Math.min(dp[i/3] + 1, dp[i]);
			if (i%2 == 0) dp[i] = Math.min(dp[i/2] + 1, dp[i]);
		}

		System.out.println(dp[number]);
	}
}