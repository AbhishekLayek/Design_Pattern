package singleton_design_pattern.breaking_singleton_design_pattern;

public class Singleton {
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		if(singleton == null) {
			synchronized (Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
