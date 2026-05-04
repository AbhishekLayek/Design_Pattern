package adapter_design_pattern;

public class AdapterCharger implements AppleCharger{
	
	private AndroidCharger charger;
	
	AdapterCharger(AndroidCharger charger){
		this.charger = charger;
	}

	@Override
	public void chargePhone() {
		charger.chargerAndroidPhone();
		System.out.println("Your Iphone Is Charging Using Adapter");
	}
}
