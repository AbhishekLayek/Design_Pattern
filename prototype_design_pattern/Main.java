package prototype_design_pattern;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.168.10.4");
		networkConnection.loadImportantData();
		
		System.out.println(networkConnection); // NetworkConnection [ip=192.168.10.4, importantData=Important Data]
		
		NetworkConnection networkConnection2;
		
		try {
			networkConnection2 = (NetworkConnection)networkConnection.clone();
			System.out.println(networkConnection2); // NetworkConnection [ip=192.168.10.4, importantData=Important Data]
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
