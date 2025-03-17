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
		for (Employee m : employees) {
			System.out.println(m.getName() + ": " + m.getAnnualSalary());
		}
	}
	
	public double getTotalSalary() {
		double sum = 0;
		for (Employee m : employees) {
			sum += m.getAnnualSalary();
		}
		return sum;
	}
}
