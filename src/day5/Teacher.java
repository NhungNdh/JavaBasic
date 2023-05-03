package day5;

public class Teacher extends User{
	//States/Attributes
	public String teacherId; // 6 chars
	// Methods/behaviors
	public void pritnInformation() {
		// print information by column
		System.out.printf("%-20s %-15s\n", "name", "birthday","teacherId");
		System.out.printf("%-20s %-15s\n", name, birthDay,teacherId);
	}
}
