package food;

//도구를 가지고 요리를 하는 요리사 정의
public class Cook {
	//유지 보수성을 높이기위해서는 정확한 자료형보다는 상위 자료형을 보유할 수록
	//외부의 변화에 민감해지지 않음(의존성을 약화시킴==즉 결합도를 약화시켜야 함)
	//DI : 현재 요리사 객체가 의존하고 있는 팬들을 외부에서 주입받음. 
	//==즉 의존성있는 객체를 외부로부터 주입
	Pan pan;
	
	//1) 생성자를 통해 주입받는 방법==생성자 주입
	public Cook(Pan pan) { 
		//pan=new FriPan(); //new와 생성자 조합은 결합도를 크게 높임
		this.pan = pan;
	}
	
	//2) setter로 주입받는 방법==세터 주입
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	
	public void makeFood() {
		pan.boil();
	}
}
