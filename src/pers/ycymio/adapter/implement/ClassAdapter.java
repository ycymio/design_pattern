package pers.ycymio.adapter.implement;

public class ClassAdapter extends Adaptee implements Target  {
    @Override
    public void request() {
        System.out.println("我是继承方式实现的适配器类 我能适配任何两孔插座 让它正常工作");
        this.specificRequest();
    }
 }