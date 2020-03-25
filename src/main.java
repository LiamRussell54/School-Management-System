import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		//array lists the teachers and students will be stored
		List<Teacher> teachers = new ArrayList<>();
		List<Student> students = new ArrayList<>();
		//test school
		School sch = new School(teachers, students);
		
		//Declaring the teachers at the school and their salary
		Teacher jeff = new Teacher(1, "Jeff", 16000.0, sch);
		Teacher sara = new Teacher(2, "Sara", 16000.0, sch);
		
		//Declaring the students at the school, their id, name, grade and school
		Student tom = new Student(1, "Tom", 6, sch);
		Student bob = new Student(2, "Bob", 6, sch);
		Student jim = new Student(3, "Jim", 5, sch);
		Student chloe = new Student(4, "Chloe", 5, sch);
		Student lily = new Student(5, "Lily", 5, sch);
		Student chris = new Student(6, "Chris", 6, sch);
		
		
		//students paying fees to the school
		tom.payFees(5000.0, sch);
		bob.payFees(7000.0, sch);
		jim.payFees(2000.0, sch);
		chloe.payFees(6000.0, sch);
		lily.payFees(8000.0, sch);
		chris.payFees(9000.0, sch);
		
		tom.payFees(2000.0, sch);
		bob.payFees(1000.0, sch);
		
		//printing the name of all the students at the school
		System.out.println();
		System.out.print("Students: ");
		for(Student s : students) {
			System.out.print(s.getName()+", ");
		}
		//priting the names of all the teachers at the school
		System.out.print("\nTeachers: ");
		for(Teacher t : teachers) {
			System.out.print(t.getName()+", ");
		}
		System.out.println();
		
		//changing Jeff's salary
		jeff.setSalary(17000.0, sch);
		
		//displaying the schools final finances 
		System.out.println("\nExpected income: " + sch.getExpectedIncome());
		System.out.println("Final income: " + sch.getIncome());
		System.out.println("Final expenses: " + sch.getExpenses());
		System.out.println("Final profit: " + sch.getProfit());
		
		
	}

}
