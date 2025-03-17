public class DepartmentHead extends Employee {

	private String department;

	public DepartmentHead(String name, double monthlySalary, String department) {
		super(name, monthlySalary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getAnnualSalary() {
		//13 Monatslöhne
		return super.getAnnualSalary() + this.getMonthlySalary();
	}
}
