package ex01;


import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		SpringTest s1 = ctx.getBean(SpringTest.class);
		s1.test();
		
		SpringTest s2 = ctx.getBean(SpringTest.class);
		s2.test();
		
		//스프링IOS컨테이는 기본적으로 bean을 싱글톤 형식으로 생성합니다.
		//만약, bean을 사용할 때마다 새로운 객체 형태로 쓰고싶다면 scope="prototype" 기술하면 됩니다.
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}

