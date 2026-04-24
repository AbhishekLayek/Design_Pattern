package singleton_design_pattern.soluion1_from_breaking_singleton_pattern;

public class Singleton {
	private static Singleton singleton;
	
	private Singleton() {
		if(singleton != null) {
			throw new RuntimeException("You Are Trying To Break Singleton Design Pattern!");
		}
	}
	
	public static Singleton getSingleton() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
