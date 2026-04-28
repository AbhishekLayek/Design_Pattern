package deep_copy;

public class Person {
	String name;
	Address address;
	
	Person(String name, Address address){
		this.name = name;
		this.address = address;
	}
	
	// Deep Copy Constructor
	
	Person(Person p){
		this.name = p.name;
		this.address = new Address(p.address.city);
	}
}
