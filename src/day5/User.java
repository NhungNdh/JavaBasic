package day5;

public class User {
	//States/Attributes
	public String name; // 20 chars
	public String birthDay; // 15 chars

	// Methods/behaviors
	void pritnInformation() {
		// print information by column
		System.out.printf("%-20s %-15s\n", "name", "birthday");
		System.out.printf("%-20s %-15s\n", name, birthDay);
	}
}
