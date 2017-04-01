package pers.ycymio.strategy.implement;

public class Client {
	public static void main(String[] args) {
		Context context;
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();
		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}
}
