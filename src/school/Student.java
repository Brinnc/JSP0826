package school;

public class Student {
	Bell bell;

	//생성자 주입
	/*
	public Student(Bell bel) {
		this.bell=bell;
		
	}
	*/
	
	//setter 주입
	public void setBell(Bell bell) {
		this.bell = bell;
	}
	
	public void study() {
		System.out.println("공부 시간");
		//bell.sound();
	}
	
	public void rest() {
		System.out.println("쉬는 시간");
		//bell.sound();
	}
	
	public void haveLunch() {
		System.out.println("점심 시간");
		//bell.sound();
	}
	
	public void end() {
		System.out.println("종례 시간");
		//bell.sound();
	}
	
}
