/*
 * Problem: 
 * Whenever we want to create object that consist many attributes then following problems can occur -
 * 
 * 1. If we want to create object then we need to pass many parameters to the constructor.
 * 2. Among those many parameters, some of the parameters can be optional.
 * 
 * Solution: In Builder Design Pattern we will create the object step by step and then we will return the final object.
 */

package builder_design_pattern;

public class User {
	private String name;
	private int age;
	private String country;
	private String phone;
	
	private User(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.country = builder.country;
		this.phone = builder.phone;
	}
	
	public void showUser() {
		System.out.println("Name: " + name + ", Age: " + age + ", Country: " + country + ", Phone: " + phone);
	}
	
	// Static Inner Class
	
	public static class Builder{
		private String name;
		private int age;
		private String country;
		private String phone;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Builder country(String country) {
			this.country = country;
			return this;
		}
		
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
