import java.util.Random;
import java.util.Scanner;

public class Exam03_2 {

	public static void main(String[] args) {
		// ���� ���� �����ϱ�.
		// ���۷��� �ڷ����� ù���ڰ� �빮�ڷ� �����Ѵ�.

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("PLUS GAME");

		while (true) {

			int num1 = random.nextInt(5) + 1;
			int num2 = random.nextInt(5) + 1;

			while (true) {

				// ex - ()�ȿ� ������ �����ϸ� 0���� 4���� ���´� >>1���� ������ �ϰ������ �ڿ� +1

				System.out.print(num1 + " + " + num2 + " = ");
				int answer = sc.nextInt();

				// answer ���� num1+num2���� �����ϸ� ���� ���, �ƴ϶�� ���� ���
				int result = num1 + num2;
				if (answer == result) {
					System.out.println("����");
					break;  //���� ����� �ݺ����� ����������.(���� break�� �����ִ� �ݺ����� ����������.)
				} else {
					System.out.println("����");

				}
			}
			// System.out.println(result == answer ? "����" : "����" );

		}
	}
}
