package pers.ycymio.adapter.implement;

public class ComponentAdapter implements Target{
	private Adaptee adaptee;
	
	public ComponentAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

    public void request() {
        System.out.println("我是组合方式实现的适配器类 我能适配任何两孔插座 让它正常工作");
    	this.adaptee.specificRequest();
    }

}
