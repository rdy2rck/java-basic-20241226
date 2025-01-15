//문제2
//정수 배열 array와 2차원 정수 배열 queries이 주어진다.
//queries의 원소는 각각 하나의 query를 나타내며, [s, e] 형태다.
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 array[index]에 1을 더한다.
//위 규칙에 따라 queries를 처리한 이후의 array를 return 한다.
//메서드의 반환 타입은 정수의 배열이고 메서드명은 solution, 매개변수의 타입은 1차원 정수 배열 타입 array, 2차원 정수 배열 타입 queries 로 받으면서
//접근 제어는 모든 패키지에서 사용할 수 있도록 하며오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.

//제한사항
//1 ≤ array의 길이 ≤ 1,000
//  - 0 ≤ arr의 원소 ≤ 1,000,000
//1 ≤ queries의 길이 ≤ 1,000
//  - 0 ≤ s ≤ e < arr의 길이

package firstProject;

public class Test2 {
	
	public int[] solution(int[] array, int[][] queries) throws Exception {
		if (array.length < 1 || array.length > 1000) {
			throw new Exception("1개 이상 1000개 이하의 정수를 입력해주세요.");
		}
		for (int num : array) {
			if (num < 0 || num > 1000000) {
				throw new Exception("0 이상 1000000 이하의 정수만 입력해주세요");
			}
		}
		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			if (s < 0 || e >= array.length || s > e) {
				throw new Exception("s와 e의 값이 유효하지 않습니다.");
			}
			for (int j = s; j <= e; j++) {
				array[j] += 1;
			}
		}
		
		return array;
	}

	public static void main(String[] args) throws Exception {
		Test2 test2 = new Test2();
		
		int[] array = {1, 2, 3, 4, 5};
		
		int[][] queries = {
				{0, 3}, {0, 2}, {0, 1}
		};
		
		int[] result = test2.solution(array, queries);
		System.out.print("수정된 배열 : ");
		for (int res : result) {
			System.out.print(res);
		}

	}

}

//메서드 반환 타입 : 정수 배열 = arr
//메서드명 : solution
//매개변수 타입 : 1차원 정수 배열 array, 2차원 정수 배열 queries
//접근 제어 : 모든 패키지에서 사용 가능 = public
//오버라이딩 가능 = final or static 사용 금지
//