package basic;

public class Calculator {

	public static void main(String[] args) {
		
		int a = 15, b = 2;
		double c = 15.0, d = 2.0;
		
		int intResult = 0;
		double doubleResult = 0.0;
		
		//산술 연산자 : 사칙연산을 수행하는 연산자
		
		//더하기 : +
		//좌항에 우항을 더한 값을 반환
		
		intResult = a + b;
		System.out.println(intResult);
		doubleResult = b + d;
		System.out.println(doubleResult);
		
		//빼기 : -
		//좌항에 우항을 뺀 값을 반환
		
		intResult = a - b;
		System.out.println(intResult);
		doubleResult = a - c;
		System.out.println(doubleResult);
		
		//곱하기 : *
		//좌항에 우항을 곱한 값을 반환
		
		intResult = a * b;
		System.out.println(intResult);
		doubleResult = c * b;
		System.out.println(doubleResult);
		
		//나누기 : /
		//좌항에 우항을 나눈 값을 반환
		//정수와 정수를 나누면 실수부가 소멸
		intResult = a / b;
		System.out.println(intResult);
		doubleResult = a / d;
		System.out.println(doubleResult);
		
		//나머지 : %
		//좌항에 우항을 나눈 나머지를 반환
		intResult = a % b;
		System.out.println(intResult);
		doubleResult = b % c;
		System.out.println(doubleResult);
		
		//증감연산자
		//피연산자 값을 1 증가 혹은 감소
		//단항 연산자, 피연산자는 반드시 변수이여야 함
		int number = 7;
		number--;
		System.out.println(number);
		number++;
		System.out.println(number);
		
		//number : 8
		//선행 증감 연산은 증감 연산 수행 → 다른 연산 수행
		//후행 증감 연산은 다른 연산 수행 → 증감 연산 수행
		System.out.println(10 + ++number);
		System.out.println(number);
		
		final int NUMBER = 7;
		// NUMBER++;
		// 7++;
		
		//대입 연산자 : 좌항에 우항을 할당
		
		//일반 대입 연산자 : =
		//좌항에 우항의 연산 결과를 할당
		//좌항에 일반 변수와 상수형 변수 전부 올 수 있음
		//단, 상수형 변수에는 초기화 시에만 사용 가능
		number = 10 + 5;
		
		//복합 대입 연산자 : 타연산자=
		//좌항에 우항의 연산 결과를 좌항에 할당
		//좌항은 반드시 초기화가 이루어진 일반 변수여야 함
		number += 3;
		System.out.println(number);
		
		//int number2;
		//number2 += 1;
		//final int NUMBER2 = 10;
		//NUMBER2 += 10;
		
		//비교 연산자 : 
		boolean booleanResult = true;
		
		//같다, 다르다 연산자
		// == : 좌항이 우항과 같으면 true, 다르면 false
		// != : 좌항이 우항과 다르면 true, 같으면 false
		// a : 15, b : 2, c : 15.0, d : 7.0
		booleanResult = a == b;
		System.out.println(booleanResult);
		booleanResult = a != b;
		System.out.println(booleanResult);
		
		//작다, 작거나 같다 연산자
		// < : 좌항이 우항보다 작으면 true, 크거나 같으면 false
		// <= : 좌항이 우항보다 작거나 같으면 true, 크면 false
		booleanResult = a < c;
		System.out.println(booleanResult);
		booleanResult = a <= c;
		System.out.println(booleanResult);
		
		//크다, 크거나 같다 연산자
		// > : 좌항이 우항보다 크면 true, 작거나 같으면 false
		// >= : 좌항이 우항보다 크거나 같으면 true, 작으면 false
		booleanResult = a > c;
		System.out.println(booleanResult);
		booleanResult = a >= c;
		System.out.println(booleanResult);
		
		//논리 연산자 : 피연산자가 모두 논리값인 연산자, 피연산자를 조합
		
		//1. 논리 AND 연산자 - 좌항과 우항이 모두 true일 때 true를 반환, 하나라도 false이면 false를 반환
		booleanResult = true && true;
		System.out.println(booleanResult);
		booleanResult = (a == b) && (c == d);
		System.out.println(booleanResult);
		
		//2. 논리 OR 연산자 - 좌항과 우항 중 하나라도 true면 true 반환
		booleanResult = true || false;
		System.out.println(booleanResult);
		booleanResult = (a>b) || (c<d);
		System.out.println(booleanResult);
		
		//3. 논리 NOT 연산자 - 피연산자가 true면 false, 피연산자가 false면 true 반환
		System.out.println(!booleanResult);
		
		//AND 연산의 경우 좌항이 false이면 우항의 코드는 dead code가 됨
		//OR 연산의 경우 좌항이 false이면 우항의 코드는 dead code가 됨
		System.out.println(a);
		booleanResult = false && (a++ > b);
		System.out.println(booleanResult);
		System.out.println(a);
		
		//삼항 연산자 : 조건에 따라 지정한 결과를 반환하는 연산자
		//조건(논리식) ? 참일 때 결과 : 거짓일 때 결과
		String resultString = true ? "참" : "거짓";
		System.out.println(resultString);
		
	}

}