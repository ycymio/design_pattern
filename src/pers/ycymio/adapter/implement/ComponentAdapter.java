package pers.ycymio.adapter.implement;

public class ComponentAdapter implements Target{
	private Adaptee adaptee;
	
	public ComponentAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

    public void request() {
        System.out.println("������Ϸ�ʽʵ�ֵ��������� ���������κ����ײ��� ������������");
    	this.adaptee.specificRequest();
    }

}
