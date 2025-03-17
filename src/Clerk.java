
public class Clerk extends Employee {

	private String certification;

	public Clerk(String name, double monthlySalary, String certification) {
		super(name, monthlySalary);
		this.certification = certification;
	}
	
	public String getCertification() {
		return certification;
	}
}
