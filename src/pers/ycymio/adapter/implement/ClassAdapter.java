package pers.ycymio.adapter.implement;

public class ClassAdapter extends Adaptee implements Target  {
    @Override
    public void request() {
        System.out.println("���Ǽ̳з�ʽʵ�ֵ��������� ���������κ����ײ��� ������������");
        this.specificRequest();
    }
 }