package abstract_design_pattern;

public class EmployeeFactory {
	public static Employee getEmployee(AbstractEmployeeFactory factory) {
		return factory.createEmployee();
	}
}
