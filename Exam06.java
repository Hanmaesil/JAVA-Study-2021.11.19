
public class Exam06 {

	public static void main(String[] args) {
		// �ǽ� : 1~100������ 3�� ����� ��� ��, 3�� ����� ���� ����ϼ���.

		int sum = 0;
		int i = 0;
//		for (i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//				sum = sum + i;
//			}
//		}
//		System.out.println(sum);

		for (i = 3; i <= 100; i += 3) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
