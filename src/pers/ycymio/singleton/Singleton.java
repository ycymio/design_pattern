package pers.ycymio.singleton;


public class Singleton {
	
//	// 饿汉式 静态变量
//	private static Singleton instance = new Singleton();
//	private Singleton() { }
//	public static Singleton getInstance(){
//		return instance;
//	}
	
//	// 懒汉法 线程不安全
//	private static Singleton instance = null;
//	private Singleton(){}
//	public static Singleton getInstance(){
//		if( instance == null){
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
//	// 懒汉法 线程安全 效率不高
//	private static Singleton instance = null;
//	private Singleton() {}
//	public synchronized static Singleton getInstance(){
//		if( instance == null ){
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
//	// 懒汉法 线程安全 JDK 1.5+
//	private static violate Singleton instance;
//	private Singleton() {}
//	public static Singleton getInstance(){
//		if ( instance == null ){
//			synchronized (Singleton.class){
//				if (instance == null ){
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}

	private Singleton() { }

	private static class InnerSingleton{
		private static final Singleton instance = new Singleton();
	}

	public static Singleton getInstance(){
		return InnerSingleton.instance;
	}
}
