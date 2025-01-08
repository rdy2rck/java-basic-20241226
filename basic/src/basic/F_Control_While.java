package basic;

import java.util.Scanner;

public class F_Control_While {

	public static void main(String[] args) {
		
		// while문 : 반복할 횟수가 결정되어 있지 않을 때 사용하는 반복문
		// 조건이 true인 동안 반복, 조건이 false가 되면 반복을 종료
		// while (논리표현식) { 논리표현식이 true일때 반복할 코드 블럭 }
		
		// 사용자로부터 입력받은 정수를 모두 더해 출력
		// 만약 사용자가 양수가 아닌 값을 입력하면 총합을 출력 후 프로그램 종료
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int number = scan.nextInt();
		int sum = 0;
		
		while(number > 0) {
			sum += number;
			System.out.println("정수를 입력하세요 : ");
			number = scan.nextInt();
		}
		
		System.out.println("총합 : " + sum);
		
		// continue : 반복문에서 continue를 만나면 코드 블럭의 끝으로 커
		// break : 반복문에서 break를 만나면 반복문을 탈출
		// continue, break 문은 조건문과 같이 사용됨
		
		number = 0;
		sum = 0;
		while (true) {
			System.out.println("정수: ");
			number = scan.nextInt();
			if (number <= 0) break;
			if (number % 2 != 1) continue;
			sum += number;
		}
		
		System.out.println("총합 : " + sum);
		
		number = 0;
		while (number < 10) {
			if (number % 3 != 0) {
				continue;
			}
			System.out.println(number);
			number++;
		}

	}

}
