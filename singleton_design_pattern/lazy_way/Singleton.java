package singleton_design_pattern.lazy_way;

public class Singleton {
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
