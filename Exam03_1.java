import java.util.Random;
import java.util.Scanner;

public class Exam03_1 {

	public static void main(String[] args) {
		// 랜덤 숫자 추출하기.
		// 레퍼런스 자료형은 첫글자가 대문자로 시작한다.

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("PLUS GAME");

		//int num1 = 0; >>> 변수생성
		//num1 = 1; >> 변수 참조
		
		int num1 = random.nextInt(5) + 1; // 최초 한번만 실행되면 되기 때문에 while문 밖으로 빼준다.
		int num2 = random.nextInt(5) + 1; // 최초 한번만 실행되면 되기 때문에 while문 밖으로 빼준다.
											// ex) int 같은 자료형을 쓴다는건 변수를 담을 새로운 공간을 만들어준다는 것!!!!!
		while (true) {

			// ex - ()안에 범위를 지정하면 0부터 4까지 나온다 >>1부터 나오게 하고싶으면 뒤에 +1

			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();

			// answer 값이 num1+num2값과 동일하면 정답 출력, 아니라면 오답 출력
			int result = num1 + num2;
			if (answer == result) {
				System.out.println("정답");
				num1 = random.nextInt(5) + 1;
				num2 = random.nextInt(5) + 1;
			} else {
				System.out.println("오답"); // while문으로 돌아가도 while문 안에서 새로운 숫자를 안받았기때문에 숫자가 그대로 출력된다.

			}
		}
		// System.out.println(result == answer ? "정답" : "오답" );

	}

}
