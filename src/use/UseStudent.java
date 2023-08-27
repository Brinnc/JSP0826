package use;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import school.Student;

public class UseStudent {
	
	public UseStudent() {
		ClassPathXmlApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println(context);
		
		//스프링 컨테이너로부터 인스턴스 얻어오기
		Student st=(Student)context.getBean("student");
		st.study();
		st.rest();
		st.haveLunch();
		st.end();
		
	}
	
	
	public static void main(String[] args) {
		new UseStudent();
	}
}
