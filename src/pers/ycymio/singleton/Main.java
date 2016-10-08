package pers.ycymio.singleton;

public class Main {
	public static void main(String[] args){
		System.out.println("Start: ");
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance1.toString());
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2.toString());
		System.out.println("Is it the same: " + (instance1 == instance2));
		System.out.println("End------------------->");
	}

}
