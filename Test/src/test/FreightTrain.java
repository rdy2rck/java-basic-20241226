package test;

public class FreightTrain extends Train implements Vehicle {
	private double cargoWeight;
	boolean isStart;
	
	public FreightTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, double cargoWeight) {
		super(trainNumber, departureStation, arrivalStation, isStart);
		this.cargoWeight = cargoWeight;
	}

	@Override
	public void accelerate() {
		if (!isStart) {
			System.out.println("화물 열차가 느리게 가속합니다!");
		} else {
			System.out.println("화물 열차가 가속하지 않습니다.");
		}
	}

	@Override
	public void stop() {
		if (!isStart) {
			System.out.println("화물 열차가 느리게 정차합니다!");
		} else {
			System.out.println("화물 열차가 정차하지 않습니다.");
		}
	}
	
	@Override
	public void setStart(boolean start) {
		if (isStart) {
			System.out.println("화물 열차의 시동을 켭니다.");
		} else {
			System.out.println("화물 열차의 시동을 끕니다.");
		}
	}

}
