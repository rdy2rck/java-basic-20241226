package chapter02_sub;

class Controller {
	
	Service service;

	Controller(Service service) {
		this.service = service;
	}
	
	void controllerMethod() {
		System.out.println("Controller A");
		service.serviceMethod();
	}
	
	void controllerMethod2() {
		System.out.println("Controller A2");
		service.serviceMethod2();
	}
	
}

class Service {
	
	IRepository repository;
	
	Service(IRepository repository) {
		this.repository = repository;
	}
	
	void serviceMethod() {
		System.out.println("Service A");
		repository.repositoryMethod();
	}
	
	void serviceMethod2() {
		System.out.println("Service A2");
		repository.repositoryMethod2();
	}
	
}

interface IRepository {
	void repositoryMethod();
	void repositoryMethod2();
}

class Repository implements IRepository {
	
	public void repositoryMethod() {
		System.out.println("Repository A");
	}
	
	public void repositoryMethod2() {
		System.out.println("Repository A2");
	}
	
}

class Repository2 implements IRepository {
	
	public void repositoryMethod() {
		System.out.println("Repository B");
	}
	
	public void repositoryMethod2() {
		System.out.println("Repository A2");
	}
}

public class DIP {

	public static void main(String[] args) {
		
		Repository repository = new Repository();
		Repository2 repository2 = new Repository2();
		Service service = new Service(repository2);
		Controller controller = new Controller(service);
		controller.controllerMethod(); //결과값 출력
		
		//1. controllerMethod가 먼저 "Controller A" 출력 후 serviceMethod 실행
		//2. serviceMethod가 이어서 "Service A"를 출력 후 repositoryMethod 실행
		//3. repositoryMethod가 마지막으로 "Repository B"를 출력
	}

}
