package pers.ycymio.builder.implement;

public class Director {
	/**
     * ���е�ǰ��Ҫʹ�õĽ���������
     */
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}

    /**
     * ��Ʒ���췽����������ø���������췽��,�����Ʒ������˳���
     */
	public void construct() {
		builder.createPart1();
		builder.createPart2();
	}
	
}
