package abstract_design_pattern;

public class WebDevFactory extends AbstractEmployeeFactory{

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}
}
