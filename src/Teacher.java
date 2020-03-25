
public class Teacher {
	
	private int id;
	private String name;
	private double salary;

	//sets the teacher id, name, salary and school when constructor is called
	//adds the teacher to the array list and updates the school's expenses and profit.
	public Teacher(int id, String name, double salary, School school) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		school.addTeacher(this);
		school.updateExpenses(salary);
		school.updateProfit();
		//message is printed to confirm updated values
		System.out.println("\nPaying " + this.name + " " + salary);
		System.out.println("Updated profit: " + school.getProfit());
	}
	
	//getters
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	//update teacher salary, for promotion etc.
	//calculate the schools new expenses and profit
	public void setSalary(double amount, School school) {
		double difference = amount - this.salary;
		this.salary = amount;
		
		school.updateExpenses(difference);
		school.updateProfit();
		//message is printed to confirm updated values
		System.out.println("\nSalary update: " + this.name + ": " + salary);
		System.out.println("Updated profit: " + school.getProfit());
	}
}//class
