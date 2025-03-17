
public class Employee {

	private String name;
	private double monthlySalary;
	
	public Employee(String name, double monthlySalary) {
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public double getAnnualSalary() {
		return this.monthlySalary * 12;
	}

}
