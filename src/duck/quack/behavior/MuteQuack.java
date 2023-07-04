package duck.quack.behavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("(소리없음)뀍");
		

	}

}
