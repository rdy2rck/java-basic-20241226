package basic;

public class E_Control_F {

	public static void main(String[] args) {
		
		//코드 블럭
		//코드들의 묶음(여러 구문을 하나의 묶음(기능)으로 취급)
		//{}로 표시
		{
		int a = 10;
		int b = 20;
		int result = a + b;
		System.out.println(result);
		
		// int a = 0;
		}
		int a = 0;
		{
			// int a = 0;
			int b = 0;
		}
		
		// 제어문 : 조건에 따라서 코드의 흐름을 결정하는 것
		
		// 조건문 : 특정 조건이 만족하면 해당 코드 블럭을 실행하는 것
		
		// if문 : 주어진 논리표현식(조건)이 true면 코드 블럭을 실행하게 하는 것
		//if(논리표현식) {논리표현식이 true일때 실행할 코드블럭}
		
		System.out.println("if문 시작");
		
		int number = -10;
		
		if (number > 0)
		{
			System.out.println("양수");
		}
		
		System.out.println("if문 종료");
		
		//else문 : if문의 논리표현식이 false일 때 코드 블럭을 실행하게 하는 것
		//if (논리표현식) {true일 때 실행할 코드블럭}
		//else {false일 때 실행할 코드블럭}
		
		//주의!
		//1. else문은 반드시 if문 이후에 와야 함
		//2. else문은 반드시 논리표현식 안에서 사용해야 함
		
		System.out.println("if-else문 실행");
		
		number = -5;

		if(number > 0)
		{
			System.out.println("양수");
		}
		else
		{
			System.out.println("양수가 아님");
		}
		
		System.out.println("if-else문 중료");
		
		System.out.println("여러가지 조건 실행");
		
		number = 1;
		
		if (number > 0) System.out.println("양수");
		else if (number < 0) System.out.println("음수");
		else System.out.println("0");
		
		System.out.println("여러가지 조건 종료");
		
		// 대한민국, 성인(> 19), 남성
		String country = "대한민국";
		int age = 23;
		String gender = "남성";
		
	}

}
