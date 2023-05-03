package common;

import day5.Admin;
import day5.Student;
import day5.Teacher;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "ST1";
		st1.birthDay = "10/01/1999";
		st1.studentId = "MSV01";
		st1.pritnInformation();
		
		Teacher tc1 = new Teacher();
		tc1.name = "TC1";
		tc1.birthDay = "10/01/1999";
		tc1.teacherId = "MGV01";
		tc1.pritnInformation();
		
		Admin ad1 = new Admin();
		ad1.name = "AD1";
		ad1.birthDay = "10/01/1999";
		ad1.employeeId = "MNV01";
		ad1.pritnInformation();
	}

}
