/*
 * Deep Copy: Deep Copy will create a new object and also it will copy the referenced objects.
 */

package deep_copy;

public class DeepCopy {
	public static void main(String[] args) {
		
		Address addr = new Address("Kolkata");
		
		Person p1 = new Person("Abhishek", addr);
		
		Person p2 = new Person(p1);
		
		p2.address.city = "Delhi";
		
		System.out.println(p1.address.city); // Kolkata
	}
}
