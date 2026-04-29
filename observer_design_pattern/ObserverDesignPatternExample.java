package observer_design_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObserverDesignPatternExample {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		YoutubeChannel channel = new YoutubeChannel();
		
		while(true) {
			System.out.println("Press 1 To Upload Video");
			System.out.println("Press 2 To Create New Subscriber");
			System.out.println("Press 3 To Exit");
			
			System.out.print("Enter Your Choice:");
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				System.out.print("Enter Video Title: ");
				String title = br.readLine();
				
				channel.notifyChanges(title);
			}
			else if(c == 2) {
				
				System.out.print("Enter The Name Of Subscriber: ");
				String name = br.readLine();
				
				Subscriber s = new Subscriber(name);
				channel.subscribe(s);
			}
			else if(c == 3) {
				System.out.println("Thanks For Using App");
				break;
			}
			else {
				System.out.println("Wrong Input! Please Enter Valid Input");
			}
		}
	}
}

/*
 * Output:
 * 
 * Press 1 To Upload Video
 * Press 2 To Create New Subscriber
 * Press 3 To ExitEnter Your Choice:2
 * Enter The Name Of Subscriber: Abhishek
 * Press 1 To Upload Video
 * Press 2 To Create New Subscriber
 * Press 3 To Exit
 * Enter Your Choice:2
 * Enter The Name Of Subscriber: Payel
 * Press 1 To Upload Video
 * Press 2 To Create New Subscriber
 * Press 3 To Exit
 * Enter Your Choice:1
 * Enter Video Title: Learn Observer Design Pattern
 * Hello Abhishek New Video Uploaded: Learn Observer Design Pattern
 * Hello Payel New Video Uploaded: Learn Observer Design Pattern
 * Press 1 To Upload Video
 * Press 2 To Create New Subscriber
 * Press 3 To Exit
 * Enter Your Choice:3
 * Thanks For Using App
 */
