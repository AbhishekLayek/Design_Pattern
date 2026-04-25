package factory_design_pattern;

public class Main {
	public static void main(String[] args) {
		
		Employee e1 = EmployeeFactory.getEmployee("Android Developer");
		
		System.out.println(e1.designation()); // Android Developer
		System.out.println(e1.salary()); // 50000.0
		
		Employee e2 = EmployeeFactory.getEmployee("Web Developer");
		
		System.out.println(e2.designation()); // Web Developer
		System.out.println(e2.salary()); // 40000.0
	}
}
