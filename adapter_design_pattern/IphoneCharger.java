package adapter_design_pattern;

public class IphoneCharger implements AppleCharger{

	@Override
	public void chargePhone() {
		System.out.println("Your Iphone Is Charging...");
	}

}
