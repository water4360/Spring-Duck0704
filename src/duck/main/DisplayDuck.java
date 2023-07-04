package duck.main;

import duck.kind.Duck;

public class DisplayDuck {
	
	private Duck duck;
	
	public DisplayDuck(Duck duck) {
		this.duck = duck;
	}

	public void helloDuck() {
		duck.swim();
		duck.displayName();
		duck.performFly();
		duck.performQuack();
	}
}
