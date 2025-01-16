//문제3
//임의의 정수 number가 주어질 때 number의 모든 자릿수의 합을 계산한 후 출력하시오

//제한사항
//-2000000000 ≤ number ≤ 2000000000

package firstProject;

public class Test3 {
	
	public int solution(int number) throws Exception {
		if (number > 2000000000 || number < -2000000000) {
			throw new Exception("-2000000000 이상 2000000000 이하의 정수만 입력하세요");
		}
		if (number <= 0) {
			return 0;
		}
		
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		Test3 test3 = new Test3();
		
		System.out.println(test3.solution(27));
	}

}
