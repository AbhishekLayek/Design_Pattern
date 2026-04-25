package abstract_design_pattern;

public class WebDeveloper implements Employee{

	@Override
	public String designation() {
		return "Web Developer";
	}

	@Override
	public float salary() {
		return 40000;
	}
}
