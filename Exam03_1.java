import java.util.Random;
import java.util.Scanner;

public class Exam03_1 {

	public static void main(String[] args) {
		// ���� ���� �����ϱ�.
		// ���۷��� �ڷ����� ù���ڰ� �빮�ڷ� �����Ѵ�.

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("PLUS GAME");

		//int num1 = 0; >>> ��������
		//num1 = 1; >> ���� ����
		
		int num1 = random.nextInt(5) + 1; // ���� �ѹ��� ����Ǹ� �Ǳ� ������ while�� ������ ���ش�.
		int num2 = random.nextInt(5) + 1; // ���� �ѹ��� ����Ǹ� �Ǳ� ������ while�� ������ ���ش�.
											// ex) int ���� �ڷ����� ���ٴ°� ������ ���� ���ο� ������ ������شٴ� ��!!!!!
		while (true) {

			// ex - ()�ȿ� ������ �����ϸ� 0���� 4���� ���´� >>1���� ������ �ϰ������ �ڿ� +1

			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();

			// answer ���� num1+num2���� �����ϸ� ���� ���, �ƴ϶�� ���� ���
			int result = num1 + num2;
			if (answer == result) {
				System.out.println("����");
				num1 = random.nextInt(5) + 1;
				num2 = random.nextInt(5) + 1;
			} else {
				System.out.println("����"); // while������ ���ư��� while�� �ȿ��� ���ο� ���ڸ� �ȹ޾ұ⶧���� ���ڰ� �״�� ��µȴ�.

			}
		}
		// System.out.println(result == answer ? "����" : "����" );

	}

}
