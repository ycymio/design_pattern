package pers.ycymio.builder.implement;

public class ConcreteBuilder implements Builder {
	private Product product;

	@Override
	public void createPart1() {
		product.setPart1("this is part 1");
	}

	@Override
	public void createPart2() {
		product.setPart2("this is part 2");
	}

	@Override
	public Product retrieveProduct() {
		// TODO Auto-generated method stub
		return product;
	}

}
