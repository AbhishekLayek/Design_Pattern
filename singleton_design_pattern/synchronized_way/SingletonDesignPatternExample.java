package singleton_design_pattern.synchronized_way;

public class SingletonDesignPatternExample {
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		System.out.println(s1); // singleton_design_pattern.synchronized_way.Singleton@5caf905d
		System.out.println(s2); // singleton_design_pattern.synchronized_way.Singleton@5caf905d
	}
}
