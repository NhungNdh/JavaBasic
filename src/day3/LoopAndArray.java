package day3;
import java.util.*;

public class LoopAndArray {

	public static void main(String[] args) {
//B.Loops
	//Run ex1
		printArray();
	//Run ex2
		LoopAndArray ex2 = new LoopAndArray();
		ex2.sumAndAverage();
	//Run ex3
		sumAndAverageEx3();
	//Run ex4
		sumAndAverageEx4();
	//Run ex5
		sumAndAverageEx5();
	//Run ex6
		sumAndAverageEx6();
	//Run ex7
		sumEx7(50000);
	//Run ex8
		SquareBoardEx8(5);
	//Run ex9
		SquareBoardEx9(7);
	//Run ex10
		StringtoCharEx10("Hello World",'r');

	
//D.Array
	//Run ex1
//		GradesAverageDEx1();
		GradesAverageDEx1ver2();
	//Run ex2
		int[] a = {1,2,3,4};
		printArray(a);
	//Run ex3
		arrayToString(a);
	}
///////////////////////////////////////	
//B.Loops
//Ex1
	public static void printArray() {
		int i;
		int[] a = new int[] {1,3,5,8,9};
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

//Ex2
	public void sumAndAverage() {
		int i;
		int sum = 0;
		double average;
		for(i=1;i<=100;i++) {
			sum=sum+i;
		}
		average = (double)sum/100;
		System.out.println("The sum Ex2 is: "+sum);
		System.out.println("The average Ex2 is: "+average);
	}
	
//Ex3
	public static void sumAndAverageEx3() {
		int i;
		int count = 0;
		int sum = 0;
		double average;
		for(i=111;i<=8899;i++) {
			sum+=i;
			count++;
		}
		average = (double) sum/count;
		System.out.println("The sum Ex3 is: "+sum);
		System.out.println("The average Ex3 is: "+average);
	}
	
//Ex4
	public static void sumAndAverageEx4() {
		int i;
		int count = 0;
		int sum = 0;
		double average;
		for(i=1;i<=100;i++) {
			if(i%2==1) {
				sum+=i;
				count++;
			}
		}
		average = (double) sum/count;
		System.out.println("The sum Ex4 is: "+sum);
		System.out.println("The average Ex4 is: "+average);
	}
	
//Ex5
	public static void sumAndAverageEx5() {
		int i;
		int count = 0;
		int sum = 0;
		double average;
		for(i=1;i<=100;i++) {
			if(i%7==0) {
				sum+=i;
				count++;
			}
		}
		average = (double) sum/count;
		System.out.println("The sum Ex5 is: "+sum);
		System.out.println("The average Ex5 is: "+average);
	}
	
//Ex6
	public static void sumAndAverageEx6() {
		int i;
		int sum = 0;
		for(i=1;i<=100;i++) {
			sum+=i*i;
		}
		System.out.println("The sum of squares Ex6 is: "+sum);
	}
	
//Ex7
	public static void sumEx7(int n) {
		int i;
		double sumL2R = 0;
		double sumR2L = 0;
		for(i=1;i<=n;i++) {
			sumL2R+=(double)1/i;
		}
		System.out.println("The sum left to right Ex7 is: "+sumL2R);
		for(i=n;i>=1;i--) {
			sumR2L+=(double)1/i;
		}
		System.out.println("The sum right to left Ex7 is: "+sumR2L);
		double difference = sumR2L-sumL2R;
		System.out.printf("The difference Ex7 is: %.15f",difference);
		System.out.println();
	}


	
//Ex8
	public static void SquareBoardEx8(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("#"+" ");
			}
			System.out.println();
		}
	}
	
//Ex9
	public static void SquareBoardEx9(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2==0) {
				System.out.print("#"+" ");
				}else{
				System.out.print(" "+"#");
				}	
			}
			System.out.println();
		}
	}
	
//Ex10
	public static void StringtoCharEx10(String text, char textfind) {
		int i=0;
		int notfound=0;
		while(i<text.length()) {
			if(text.charAt(i)==textfind) {
				System.out.println("char "+textfind+" is at index: "+i);
				break;
			}else {notfound=notfound-1;}
			i++;
			}
		if(notfound==-text.length()) {
			System.out.println("Not found");
			}
	}
	
//D.Array
	//Ex1
//	public static void GradesAverageDEx1() {
//		System.out.print("Enter the number of students: ");
//		Scanner scan = new Scanner(System.in);
//		int numStudents = scan.nextInt();
//		int[] grades = new int[numStudents];
//		int sum = 0;
//		double average;
//		for(int i=0;i<numStudents;i++) {
//			System.out.print("Enter the grade for student "+(i+1)+" : ");
//			grades[i] = scan.nextInt();
//			if((grades[i]>=0)&&(grades[i]<=100)) {
//				sum+=grades[i];
//			}else {
//				System.out.println("Invalid grade, try again...");
//				i--;
//			}
//		}
//		average = (double)sum/numStudents;
//		System.out.println("The average is: "+average);
//	}
//////////////////
	public static void GradesAverageDEx1ver2() {
		System.out.print("Enter the number of students: ");
		Scanner scan = new Scanner(System.in);
		int numStudents = scan.nextInt();
		ArrayList<Integer> grades = new ArrayList<Integer>();
		int sum = 0;
		double average;
		for(int i=0;i<numStudents;i++) {
			System.out.print("Enter the grade for student "+(i+1)+" : ");
			int input = scan.nextInt();
			if((input>=0)&&(input<=100)) {
				grades.add(input);
				sum+=grades.get(i);
			}else {
				System.out.println("Invalid grade, try again...");
				i--;
			}
		}
		average = (double)sum/numStudents;
		System.out.println("The average is: "+average);
	}
	
///////////////////
	//Ex2
	public static void printArray(int[] array) {
		if(array.length>0){
			System.out.print("{");
			for(int i=0; i< array.length; i++){
				if(i==array.length-1) {
					System.out.print(array[i]);
				}else {
				System.out.print(array[i]+",");
				}
			}
			System.out.print("}");
			}else{
			System.out.println("No element in array");
			}
	}
	public static void printArray(double[] array) {
		if(array.length>0){
			System.out.print("{");
			for(int i=0; i< array.length; i++){
				if(i==array.length-1) {
					System.out.print(array[i]);
				}else {
				System.out.print(array[i]+",");
				}
			}
			System.out.print("}");
			}else{
			System.out.println("No element in array");
			}
	}
	public static void printArray(float[] array) {
		if(array.length>0){
			System.out.print("{");
			for(int i=0; i< array.length; i++){
				if(i==array.length-1) {
					System.out.print(array[i]);
				}else {
				System.out.print(array[i]+",");
				}
			}
			System.out.print("}");
			}else{
			System.out.println("No element in array");
			}
	}

	//Ex3
	public static void arrayToString(int[] array) {
		if(array.length>0){
			char[] toStrings = new char[array.length+2];
			toStrings[0]='{';
			for(int i=1; i< array.length; i++){
				toStrings[i]= (char)array[i];
			}
			toStrings[array.length+1]='}';
			String a = new String(toStrings);
			System.out.println(a);
			}else{
				System.out.println("No element in array");
				}
	}
	public static void arrayToString(double[] array) {
		if(array.length>0){
			char[] toStrings = new char[array.length+2];
			toStrings[0]='{';
			for(int i=1; i< array.length; i++){
				toStrings[i]= (char)array[i];
			}
			toStrings[array.length+1]='}';
			String a = new String(toStrings);
			System.out.println(a);
			}else{
				System.out.println("No element in array");
				}
	}
	public static void arrayToString(float[] array) {
		if(array.length>0){
			char[] toStrings = new char[array.length+2];
			toStrings[0]='{';
			for(int i=1; i< array.length; i++){
				toStrings[i]= (char)array[i];
			}
			toStrings[array.length+1]='}';
			String a = new String(toStrings);
			System.out.println(a);
			}else{
				System.out.println("No element in array");
				}
	}
}
