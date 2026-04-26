package builder_design_pattern;

public class Main {
	public static void main(String[] args) {
		
		User user = new User.Builder("Abhishek")
				            .age(24)
				            .country("India")
				            .phone("8101541095")
				            .build();
		
		user.showUser(); // Name: Abhishek, Age: 24, Country: India, Phone: 8101541095
	}
}
