package p2021.p06.p08;

import java.util.Scanner;

public class P9252 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();

		int countArr[][] = new int[word1.length() + 1][word2.length() + 1];

		for (int i = 1; i <= word1.length(); i++) {
			for (int j = 1; j <= word2.length(); j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					countArr[i][j] = countArr[i - 1][j - 1] + 1;
					continue;
				}
				countArr[i][j] = Math.max(countArr[i][j - 1], countArr[i - 1][j]);
			}
		}

		int lengthOfLCS = countArr[word1.length()][word2.length()];

		System.out.println(lengthOfLCS);

		int appendIdx = 0;
		int i = word1.length();
		int j = word2.length();
		StringBuilder sb = new StringBuilder();

		while (appendIdx < lengthOfLCS) {
			if (countArr[i][j] == countArr[i - 1][j]) {
				i--;
				continue;
			}
			if (countArr[i][j] == countArr[i][j - 1]) {
				j--;
				continue;
			}

			sb.append(word1.charAt(i-1));
			appendIdx++;
			i--;
			j--;
		}

		System.out.println(sb.reverse().toString());
	}
}