package factory_design_pattern;

public class AndroidDeveloper implements Employee{

	@Override
	public String designation() {
		return "Android Developer";
	}

	@Override
	public float salary() {
		return 50000;
	}
}
