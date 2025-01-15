package test;

public class AutomaticCar extends Car implements Vehicle {
	boolean start;
	
	public AutomaticCar(String vin, String color, boolean isStart) {
		super(vin, color, isStart);
	}

	@Override
	public void accelerate() {
		if (!isStart) {
			System.out.println("자동 변속기 자동차가 가속합니다!");
		} else {
			System.out.println("자동 변속기 자동차가 가속하지 않습니다.");
		}
	}

	@Override
	public void stop() {
		if (!isStart) {
			System.out.println("자동 변속기 자동차가 정차합니다!");
		} else {
			System.out.println("자동 변속기 자동차가 정차하지 않습니다.");
		}
	}
	
	@Override
	public void setStart(boolean start) {
		isStart = start;
		if (isStart) {
			System.out.println("자동 변속기 자동차의 시동을 켭니다.");
		} else {
			System.out.println("자동 변속기 자동차의 시동을 끕니다.");
		}
	}

}
