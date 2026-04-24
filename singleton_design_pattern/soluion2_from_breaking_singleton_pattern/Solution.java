package singleton_design_pattern.soluion2_from_breaking_singleton_pattern;

import java.lang.reflect.Constructor;

public class Solution {
	public static void main(String[] args) throws Exception{
		Singleton s1 = Singleton.INSTANCE;
		System.out.println(s1.hashCode());
		
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		
		Singleton s2 = constructor.newInstance();
		System.out.println(s2.hashCode());
	}
}


/*
 * Output:
 * 
 * 1555009629
 * Exception in thread "main" java.lang.NoSuchMethodException: singleton_design_pattern.soluion2_from_breaking_singleton_pattern.Singleton.<init>()
	at java.base/java.lang.Class.getConstructor0(Class.java:3187)
	at java.base/java.lang.Class.getDeclaredConstructor(Class.java:2491)
	at Design_Pattern/singleton_design_pattern.soluion2_from_breaking_singleton_pattern.Solution.main(Solution.java:10)
 */