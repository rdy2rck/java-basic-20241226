package test;

public class App {

	public static void main(String[] args) {
		AutomaticCar automaticCar = new AutomaticCar("10가1234", "blue", false);
		
		ManualCar manualCar = new ManualCar("10가1234", "blue", false, 0);
		
		PassengerTrain passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);
		
		FreightTrain freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);
		
		Vehicle vehicle1 = automaticCar;
		Vehicle vehicle2 = manualCar;
		Vehicle vehicle3 = passengerTrain;
		Vehicle vehicle4 = freightTrain;
		
		System.out.println("자동 변속기 자동차");
		vehicle1.accelerate();
		vehicle1.stop();
		vehicle1.setStart(false);
		
		System.out.println("수동 변속기 자동차");
		vehicle2.accelerate();
		vehicle2.stop();
		vehicle2.setStart(false);
		
		System.out.println("여객 열차");
		vehicle3.accelerate();
		vehicle3.stop();
		vehicle3.setStart(false);
		
		System.out.println("화물 열차");
		vehicle4.accelerate();
		vehicle4.stop();
		vehicle4.setStart(false);
	}

}
