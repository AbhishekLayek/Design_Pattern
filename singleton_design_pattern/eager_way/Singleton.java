package singleton_design_pattern.eager_way;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
}
