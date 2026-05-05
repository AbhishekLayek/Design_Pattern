package adapter_design_pattern;

public class Main {
	public static void main(String[] args) {
		
		// AppleCharger charger = new IphoneCharger(); --> Suppose Apple Charger Is Not Available
		
		AdapterCharger adapter = new AdapterCharger(new OnePlusCharger());
		
		Iphone iphone16 = new Iphone(adapter);
		
		iphone16.chargeIphone();
		
	}
}
