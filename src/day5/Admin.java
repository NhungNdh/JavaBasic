package day5;

public class Admin extends User {
	//States/Attributes
	public String employeeId; // 6 chars

	// Methods/behaviors
	public void pritnInformation() {
		// print information by column
		System.out.printf("%-20s %-15s\n", "name", "birthday","employeeId");
		System.out.printf("%-20s %-15s\n", name, birthDay,employeeId);
	}
}
