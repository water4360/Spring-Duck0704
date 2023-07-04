package duck.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloDuck {

	public static void main(String[] args) {
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("duck/main/setting.xml");
//		DisplayDuck dd = ac.getBean(DisplayDuck.class);
//		dd.helloDuck();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("duck/main/setting.xml");
		DisplayDuck displayDuck = ac.getBean("displayDuck", DisplayDuck.class);
		displayDuck.helloDuck();
		
		
		//아래는 테스트용
		//duck = new RubberDuck();
		//duck = new DecoyDuck();
		
//		duck.swim();
//		duck.displayName();
//		duck.setFlyBehavior(new FlyWithWings());;
//		duck.performFly();
//		
//		duck.setQuackBehavior(new Quack());
//		duck.performQuack();
		
	}

}
