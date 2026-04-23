package singleton_design_pattern.breaking_singleton_design_pattern;

import java.lang.reflect.Constructor;

public class BreakSingletonUsingReflexionAPI {
	public static void main(String[] args) throws Exception {
		
		Singleton s1 = Singleton.getSingleton();
		System.out.println(s1.hashCode()); // 1555009629
		
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		
		Singleton s2 = constructor.newInstance();
		System.out.println(s2.hashCode()); // 41359092
	}
}
