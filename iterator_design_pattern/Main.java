package iterator_design_pattern;

public class Main {
	public static void main(String[] args) {
		
		UserManagement userManagement = new UserManagement();
		
		userManagement.addUser(new User(1, "Raj"));
		userManagement.addUser(new User(2, "Rahul"));
		userManagement.addUser(new User(1, "Riya"));
		
		MyIterator myIterator = userManagement.getIterator();
		
		while(myIterator.hasNext()) {
			User user = (User)myIterator.next();
			System.out.println(user.getName());
		}
	}
}

/*
 * Output:
 * 
 * Raj
 * Rahul
 * Riya
 */
 