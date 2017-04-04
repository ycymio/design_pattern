package pers.ycymio.builder.implement;

public class Client {
	/*
	 * �ͻ��˸��𴴽������ߺ;��彨���߶���
	 * Ȼ�󣬿ͻ��˰Ѿ��彨���߶��󽻸������ߣ������߲������彨���ߣ���ʼ������Ʒ��
	 * ����Ʒ��ɺ󣬽����߰Ѳ�Ʒ�������ͻ��ˡ� 
	 * �Ѵ������彨���߶�������񽻸��ͻ��˶����ǵ����߶���
	 * ��Ϊ�˽������߶�������彨���߶������ϱ�ɶ�̬�ģ��Ӷ�ʹ�����߶�����Բ����������彨���߶����е��κ�һ����
	*/
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveProduct();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
