package test;

public class ManualCar extends Car implements Vehicle {
	private int gear;
	boolean isStart;

	public ManualCar(String vin, String color, boolean isStart, int gear) {
		super(vin, color, isStart);
		this.gear = gear;
	}
	@Override
	public void accelerate() {
		if (!isStart) {
			System.out.println("수동 변속기 자동차가 가속합니다!");
		} else {
			System.out.println("수동 변속기 자동차가 가속하지 않습니다.");
		}
	}

	@Override
	public void stop() {
		if (!isStart) {
			System.out.println("수동 변속기 자동차가 정차합니다!");
		} else {
			System.out.println("수동 변속기 자동차가 정차하지 않습니다.");
		}
	}

	@Override
	public void setStart(boolean start) {
		isStart = start;
		if (isStart) {
			System.out.println("수동 변속기 자동차의 시동을 켭니다.");
		} else {
			System.out.println("수동 변속기 자동차의 시동을 끕니다.");
		}
	}
	
	public void setGear(int gearNumber) {
		if(gear >= 0 && gear <= 6) {
			System.out.println("기어 상태 = " + gear);
		} else {
			System.out.println("잘못된 숫자입니다. 0부터 6 사이의 숫자를 입력해주세요.");
		}
	}

}
