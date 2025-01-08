package chapter2;

// 인터페이스 : 클래스가 구현해야만 하는 메서드들의 집합을 정의해둔 것
// 인터페이스의 모든 변수는 public static final 형태임
// 인터페이스의 모든 메서드는 public abstract 형태임
// 인터페이스는 다중 구현이 가능

// 인터페이스는 개발자간의 상호 약속을 위한 수단으로 사용됨
// 기능, 상수들에 대한 약속의 정의함

// 접근제어자 interface 인터페이스명 { .... }
interface AreaCalculation {
	//인터페이스의 모든 변수는 반드시 public static final이므로 생략 가능
	/*public static*/ double PI = 3.14; 
	
	
	//인터페이스의 모든 메서드는 반드시 public abstract이기 때문에 생략을 해도 됨
	/* public abstract */ double getTriangleArea(double bottom, double height);
	/* public abstract */ double getRectangleArea(double bottom, double height);
	/* public abstract */ double getCricleArea(double radius);
	
}
	
interface NormalCalculation {

	double add(double a, double b);
	
}

//인터페이스는 인터페이스끼리 상속이 가능함
//인터페이스의 상속은 다중상속이 가능
interface Calculation extends AreaCalculation, NormalCalculation {
	
}

// 인터페이스는 implements 키워드를 이용하여 클래스에서 구현할 수 있음
// 인터페이스는 다중 구현이 가능함
class Calculator implements AreaCalculation, NormalCalculation {

	@Override
	public double getTriangleArea(double bottom, double height) {
		double triangleArea = bottom * height / 2;
		return triangleArea;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		double rectangleArea = bottom * height;
		return rectangleArea;
	}

	@Override
	public double getCricleArea(double radius) {
		double circleArea = PI * radius * radius;
		return circleArea;
	}

	@Override
	public double add(double a, double b) {
		double result = a + b;
		return result;
	}
	
}

public class I_Interface {

	public static void main(String[] args) {

	}

}