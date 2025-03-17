public class Manager extends Employee {

	private double bonus;
	
	public Manager(String name, double monatslohn, double bonus) {
		super(name, monatslohn);
		this.bonus = bonus;
	}

	public double getAnnualSalary() {
		//13. Monatslöhne und Bonus
		return super.getAnnualSalary() + this.getMonthlySalary() + this.bonus;
	}
}
