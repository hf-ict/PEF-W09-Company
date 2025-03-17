import java.util.ArrayList;

public class Company {

	private ArrayList<Employee> employees = new ArrayList<Employee>();
		
	public void onboard(Employee e) {
		this.employees.add(e);
	}
	
	public void offboard(Employee e) {
		this.employees.remove(e);
	}
	
	public void printSalaries() {
		for (Employee e : employees) {
			System.out.println(e.getName() + ": " + e.getAnnualSalary());
		}
	}
	
	public double getTotalSalary() {
		double sum = 0;
		for (Employee e : employees) {
			sum += e.getAnnualSalary();
		}
		return sum;
	}
}
