package school;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Student {
	// class attributes
	public  String Name;
	public  int Age;
	public  String Address;
	public  String IdNumber;	
	
	//public methods
	public static int SumAges(Student[] students){ //method to sum the total age

		int totalAge=0;	


		for (int i = 0; i < students.length; i++) {//reads the array

			totalAge= totalAge + students[i].Age;  //sum ages
		}

		return totalAge;
	}

	public static int SumCharacters(Student[] students){//method to sum the total of characters

		int totalCharacters=0;	


		for (int i = 0; i < students.length; i++) {//reads the array

			totalCharacters= totalCharacters + students[i].Name.length(); //sum the total of characters
		}

		return totalCharacters;
	}

	public static Stream<Student> OrderByNameAndAge(Student[] students){//method to order the students by name AND age
		
		 Comparator<Student> comparator = Comparator.comparing(std-> std.Name); //Function to compare and sort students by name
		 comparator = comparator.thenComparing(Comparator.comparing(person -> person.Age)); //Function to compare and sort students by age
		 
	  	Stream<Student> personStream =  Arrays.stream(students).sorted(comparator); //transforms array into stream and sort it by order
		
		
		return  personStream;

	}
	
}
