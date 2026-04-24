package singleton_design_pattern.soluion1_from_breaking_singleton_pattern;

import java.lang.reflect.Constructor;

public class Solution {
	public static void main(String[] args) throws Exception{
		Singleton s1 = Singleton.getSingleton();
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
 * Exception in thread "main" java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)
	at Design_Pattern/singleton_design_pattern.soluion1_from_breaking_singleton_pattern.Solution.main(Solution.java:13)
	Caused by: java.lang.RuntimeException: You Are Trying To Break Singleton Design Pattern!
	at Design_Pattern/singleton_design_pattern.soluion1_from_breaking_singleton_pattern.Singleton.<init>(Singleton.java:8)
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
	... 3 more
 */