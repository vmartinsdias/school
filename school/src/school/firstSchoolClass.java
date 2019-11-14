package school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;


public class firstSchoolClass {
	

	

	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));	
		Student[] students = new Student[5]; //creates an array of 5 positions
		
		
		for (int i = 0; i < 5; i++) { //to read all the contents of an array

			Student std = new Student();
			System.out.println("What is your name?"); //how to print out to the screen
			std.Name=read.readLine(); //Reads a line of text (student's name)
			
			System.out.println("What is your age?"); //how to print out to the screen
			std.Age=Integer.parseInt(read.readLine());//Reads a line of text (student's age)
			
			System.out.println("What is your address?"); //how to print out to the screen
			std.Address=read.readLine();//Reads a line of text (student's address)
			
			System.out.println("What is your ID?"); //how to print out to the screen
			std.IdNumber=read.readLine();//Reads a line of text(student's ID number)
			
			students[i]=std;
			}
		
		
		   System.out.println("Total Age is: " + Student.SumAges(students)); // sum the total of the ages of the students
		   System.out.println("Total of characters is: " + Student.SumCharacters(students)); //sum the total of the characters of the students names
		
		   Stream<Student> StdOrded = Student.OrderByNameAndAge(students); //calls the method created at Student.java to order by name and age
		   
		   StdOrded.forEach(s-> System.out.println(s.Name + s.Age)); //print the ordered results
		   
	   
		
		
		
	}
}
