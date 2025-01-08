package basic;

public class DataType {

	public static void main(String[] args) {
		
		//정수형 데이터 타입 : 실수부가 존재하지 않음
		
		//byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		//-128 ~ +127
		
		//short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		//-32,768 ~ +32,767
		
		//int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		//-2,1347,483,648 ~ +2,147,483,647
		
		int int1 = 10000;
		// int int2 = 22000000000000000
		
		//long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		//-9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
		
		//실수형 데이터 타입 : 실수부를 가지고 있음
		
		//float
		
		//double

		//문자형 데이터 타입 :문자 하나를 저장할 수 있는 데이터 타입
		
		//char : 2byte(16bit)의 크기를 가지는 문자형 데이터 타입.
		//0 ~ 65,535
		//문자를 리터럴로 표현할 때에는 ''로 묶어서 표현
		char char1 = 'A';
		char char2 = 65; // ASCII
		char char3 = '\u0041'; // 유니코드
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		
		//논리형 데이터 타입 : 참과 거짓값을 가지는 데이터 타입
		
		//boolean : 1byte(8bit)의 크기를 가지는 논리형 데이터 타입
		//true, false
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		//형변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		
		//자동 형변환 : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수를 옮겨담을 떄 사용
		//명시적 형변환 : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수를 옮겨담을 떄 사용
		
		int number1 = 300;
		long number2 = number1;
		number1 = (int)number2;
		
		double number4 = 3.1415;
		number1 =(int) number4;
		System.out.println(number1);
		
		//배열 : 동일한 타입의 변수를 묶어서 저장하는 컨테이너
		//new 연산자를 이용해ㅓ 컨테이너를 먼저 생성해야 함
		//한번 생성된 컨테이너의 쿠기는 변경 X
		
		//배열 변수 선언
		//에이터타입 [] 배열변수명;
		//배열 생성
		// new 데이터타입[배열의길이]
		int[] numbers;
		numbers = new int[3];
		System.out.println(numbers);
		
		int[] numbers2 = {1, 2, 3};
		int[] numbers3 = new int[] {1, 2, 3};
		
		System.out.println(numbers2);
		System.out.println(numbers3);
		
		//배열의 요소에 접근 혹은 사용할 때는 '인덱스' 사용
		//배열의 시작 인덱스는 0, 마지막 인덱스는 길이 -1
		int number = numbers3[1];
		System.out.println(number);
		numbers3[1] = 22;
		System.out.println(numbers3[1]);
		
		//배열의 길이를 초과하는 인덱스에 접근 시 예외 발생
		//System.out.println(numbers[99]);
		
		//배열의 길이를 확인하고자 할 땐 .length
		System.out.println(numbers3.length);
		
		int lastIndex = numbers3.length -1;
		System.out.println(numbers3[lastIndex]);
		
		//배열의 값을 공유함
		int[] example1 = new int[] {0, 0, 0};
		int[] example2 = example1;
		
		System.out.println(example1);
		System.out.println(example2);
		
		example1[0] = 99;
		System.out.println(example1[0]);
		System.out.println(example2[0]);
		System.out.println(example1);
		
		char[] chars = {'e', 'x', 'a', 'm'};
		System.out.println(chars);
		System.out.println(chars[1]);
		
		//문자의 배열(문자열)을 표현하는데 사용되는 참조형 데이터 타입
		//문자열 선언
		//String 변수명;
		//문자열 생성
		//new String(문자열);
		//초기화
		//변수명 = "문자열";
		String string1 = "안녕하세요";
		String string2 = "잘가세요";
		System.out.println(string1 + string2);
		
		//String 객체는 불변성(변경이 불가능)을 가짐
		String string3 = "final";
		System.out.println(chars);
		System.out.println(string3);
		chars[0] = 'd';
		//string3[0] = 'd';
		string3 = "dxam";
		System.out.println(string3);
		
		//String 클래스의 주요 기능
		String statement = "오늘의";
		
		//1. 문자열 결합
		//+혹은 concat(문자열)로 두 문자열을 연결할 수 있음
		System.out.println(statement + " 메뉴");
		System.out.println(statement.concat(" 유머"));
		
		//2. 문자열 비교
		//equals(문자열) : 두 문자열이 동등한 지 비교
		//compareTo(문자열) : 두 문자열을 사전순으로 비교 (대소문자 구분)
		//compareToIgnoreCase(문자열) : 두 문자열을 사전순으로 비교 (대소문자 구분 X)
		System.out.println(statement.equals("내일의"));
		System.out.println(statement.compareTo("오늘의"));
		System.out.println(statement.compareToIgnoreCase("내일의"));
		
		//3. 문자열 길이
		//length() : 문자열의 길이 반환
		System.out.println(statement.length());
		
		//4. 문자열 반환
		//toUpperCase() : 모두 대문자로 변환
		//toLowerCase() : 모두 소문자로 변환
		//trim() : 앞 뒤 공백 제거
		//replace(찾을 문자열, 바꿀 문자열) : 특정 문자열을 찾아 치환
		String name = " Antonie ";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.replaceAll(name, "Garnacho"));
		
		//5. 문자열 찾기
		//indexOf(문자열) : 찾고자 하는 문자열의 처음 찾은 위치의 인덱스 번호를 반환
		//lastIndexOf(문자열) : 찾고자 하는 문자열의 마지막 위치의 인덕스 번호를 반환
		String sentence = "어딜 만져 어딜 만지냐고";
		System.out.println(sentence.indexOf("만져"));
		System.out.println(sentence.indexOf("만지냐고"));
		
		//6. 부분 문자열
		//substring(시작 인덱스), substring(시작 인덱스, 종료 인덱스) : 문자열을 원하는 크기만큼 추출
		String quote = "어벤저스 어셈블";
		System.out.println(quote.substring(3));
		System.out.println(quote.substring(1,6));
		
		//참조형 데이터 타입
		//주소를 가지는 변수의 데이터 타입
		//null(아무것도 지정되지 않은 상태)의 값을 가질 수 있음
		//배열, 클래스, 인터페이스, 열거형이 참조형 데이터 타입에 속함
		String string4 = "This cake is lie!";
		System.out.println(string4.substring(0));
	}
}
