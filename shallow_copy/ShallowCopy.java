/*
 * Shallow Copy: Shallow Copy will create a new object but it will not copy the referenced object, instead it will copy the reference. As a result both original and copy objects point to the same memory address.
 */

package shallow_copy;

public class ShallowCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr = new Address("Kolkata");
		
		Person p1 = new Person("Abhishek", addr);
		
		Person p2 = (Person) p1.clone();
		
		p2.address.city = "Delhi"; // We are changing in p2 object.
		
		System.out.println(p1.address.city); // Delhi
	}
}
