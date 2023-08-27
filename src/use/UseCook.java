package use;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import food.Cook;

public class UseCook {

	public UseCook() {
		//스프링의 컨테이너에서, 요리사를 추출하여 메서드 호출
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		System.out.println(context);
		
		//new하지 않고 스프링 컨테이너에서 얻어옴
		Cook cook=(Cook)context.getBean("cook");
		
		cook.makeFood();
	}
	
	public static void main(String[] args) {
		new UseCook();

	}

}
