package day5;

public class Student extends User{
	//States/Attributes
	public String studentId; //6 chars
	
	//Methods/behaviors
	public void pritnInformation() {
		// print information by column
		System.out.printf("%-20s %-15s\n", "name", "birthday","studentId");
		System.out.printf("%-20s %-15s\n", name, birthDay,studentId);
	}
}
