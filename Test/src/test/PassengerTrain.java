package test;

public class PassengerTrain extends Train implements Vehicle {
	private int passengerCount;
	boolean isStart;

	public PassengerTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, int passengerCount) {
		super(trainNumber, departureStation, arrivalStation, isStart);
		this.passengerCount = passengerCount;
	}
	
	@Override
	public void accelerate() {
		if (!isStart) {
			System.out.println("여객 열차가 천천히 가속합니다!");
		} else {
			System.out.println("여객 열차가 가속하지 않습니다.");
		}
	}

	@Override
	public void stop() {
		if (!isStart) {
			System.out.println("여객 열차가 천천히 정차합니다!");
		} else {
			System.out.println("여객 열차가 정차하지 않습니다.");
		}
	}
	
	@Override
	public void setStart(boolean start) {
		if (isStart) {
			System.out.println("여객 열차의 시동을 켭니다.");
		} else {
			System.out.println("여객 열차의 시동을 끕니다.");
		}
	}

}
