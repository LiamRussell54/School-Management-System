
public class Student {
	
	private int id;
	private String name;
	private int grade;
	private double feesPaid = 0;
	private double feesTotal = 9000;
	
	//sets the student id, name, grade and school when constructor is called
	//adds the student to the array list and updates the schools expeced income.
	public Student(int id, String name, int grade, School school) {
		this.feesPaid = id;
		this.name = name;
		this.grade = grade;

		school.addStudent(this);
		school.updateExpectedIncome(feesTotal);
	}//constructor
	
	//updates the feesPayed variable and updates the schools
	//income and profit. Message is printed out to confirm.
	public void payFees(double amount, School school) {
		feesPaid += amount;
		school.updateIncome(amount);
		school.updateProfit();
		
		System.out.println("\n" + this.name + " paid:"+ amount + ". Their total fees paid:" + feesPaid + ". Fees remaining: " + (feesTotal - feesPaid));
		System.out.println("Updated profit: " + school.getProfit());
	}
	
	
	//students grade can be updated when they move up a grade.
	public void setGrade(int grade) {
		this.grade = grade;
	}
	//getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public double getFeesPaid() {
		return feesPaid;
	}

	public double getFeesTotal() {
		return feesTotal;
	}
	
	public double getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
	
}//class
