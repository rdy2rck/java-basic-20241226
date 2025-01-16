//문제1
//정수 리스트 numList가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 메서드를 완성해주세요.
//음수가 없다면 -1을 return한다.
//메서드의 반환 타입은 정수 타입이고 메서드명은 solution, 매개변수의 타입은 정수의 배열로 받으면서
//접근 제어는 모든 패키지에서 사용할 수 있도록 하며 오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.

//제한사항
//5 ≤ numList의 길이 ≤ 100
//-10 ≤ numList의 원소 ≤ 100

package firstProject;

import java.util.Scanner;

public class Test {

	public int solution(int[] arr) throws Exception {
		if (arr.length < 5 || arr.length > 100) {
			throw new Exception("5개 이상 100개 이하의 정수만 입력하세요");
		}
		for (int num : arr) {
			if (num < -10 || num > 100) {
				throw new Exception("-10 이상 100 이하의 정수만 입력하세요");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		Test test = new Test();
		
		int[] array1 = {3, -2, 9, 4, 3};
		int[] array2 = {2, 3, 6, 3, 6};
		int[] array3 = {2, -4, 6, 7};
		int[] array4 = {-103, 6, 7, 5, 3};
		
		System.out.println("첫 번째 음수 : " + test.solution(array1));
		System.out.println("첫 번째 음수 : " + test.solution(array2));
		System.out.println("첫 번째 음수 : " + test.solution(array3));
		System.out.println("첫 번째 음수 : " + test.solution(array4));
	}

}

// 메서드 반환 정수 타입 = int
// 메서드명 solution
// 매개변수 타입 정수 배열 = arr
// 접근 제어 모든 패키지
// 오버라이딩 가능
// 구현부 존저