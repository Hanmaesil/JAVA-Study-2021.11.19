
public class Exam06 {

	public static void main(String[] args) {
		// 실습 : 1~100까지의 3의 배수만 출력 후, 3의 배수의 합을 출력하세요.

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
