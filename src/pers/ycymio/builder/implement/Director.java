package pers.ycymio.builder.implement;

public class Director {
	/**
     * 持有当前需要使用的建造器对象
     */
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}

    /**
     * 产品构造方法，负责调用各个零件建造方法,比如产品的生产顺序等
     */
	public void construct() {
		builder.createPart1();
		builder.createPart2();
	}
	
}
