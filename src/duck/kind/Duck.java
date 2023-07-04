package duck.kind;

import duck.fly.behavior.FlyBehavior;
import duck.quack.behavior.QuackBehavior;

public abstract class Duck {
	
	//얘네는 interface
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck() {
		super();
	}
	
	public void swim() {
		System.out.println("오리는 수영하지~");
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void displayName();
	

}
