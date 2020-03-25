import java.util.List;

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private double expectedIncome = 0.0;
	private double income = 0.0;
	private double expenses = 0.0;
	private double profit = 0.0;
	
	
	//sets the array lists the teachers and students are stored in
	public School(List<Teacher> teachers, List<Student> students ) {
		this.teachers = teachers;
		this.students = students; 
	}
	
	//getters, setters and updating values
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}
	
	public double getExpectedIncome() {
		return expectedIncome;
	}
	
	public void updateExpectedIncome(double amount) {
		expectedIncome += amount;
	}
	
	public double getIncome() {
		return income;
	}
	
	public void updateIncome(double amount) {
		income += amount;
	}
	
	public double getExpenses() {
		return expenses;
	}

	public void updateExpenses(double amount) {
		expenses += amount;
	}
	
	public double getProfit() {
		return profit;
	}

	public void updateProfit() {
		profit = income - expenses;
	}
}
