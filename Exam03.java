import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 랜덤 숫자 추출하기.
		// 레퍼런스 자료형은 첫글자가 대문자로 시작한다.
		// while 반복문 사용시 미리 설정 할 것. : 1. 반복범위 2. 빠져나갈 조건
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("PLUS GAME");

		while (true) {

			int num1 = random.nextInt(5) + 1; // ex - ()안에 범위를 지정하면 0부터 4까지 나온다 >>1부터 나오게 하고싶으면 뒤에 +1
			int num2 = random.nextInt(5) + 1;

			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();

			// answer 값이 num1+num2값과 동일하면 정답 출력, 아니라면 오답 출력
			int result = num1 + num2;
			if (answer == result) {
				System.out.println("정답");
			} else {
				while (answer != result) {
					System.out.println("오답");
					System.out.print(num1 + " + " + num2 + " = ");
					answer = sc.nextInt();
					if (answer == result) {
						System.out.println("정답");
					}
				}
			}
		}
		// System.out.println(result == answer ? "정답" : "오답" );

	}

}
