import java.util.Scanner;

public class P1978 { //�Ҽ� ���ϴ¿���

	static boolean frime(int num) {
		if (num < 2) { // 2�̸��̸� �Ҽ��� �ƴϱ⶧���� false ��ȯ
			return false;
		} else {
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) { //�Ҽ��� �ƴҰ��  false ��ȯ
					return false;
				}
			}
		}
		return true; //�Ҽ��� ��� true ��ȯ
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		int primeCount = 0;
		for (int i = 0; i < roop; i++) {
			if (frime(sc.nextInt()))
				primeCount++;
		}
		System.out.println(primeCount);
	}
}
