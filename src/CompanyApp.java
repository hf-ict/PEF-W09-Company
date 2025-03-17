
public class CompanyApp {

	public static void main(String[] args) {
		Company company = new Company();
		
		Employee clerk = new Clerk("Muster", 5000, "Bürolehre");
		Employee departmentHead = new DepartmentHead("Mustermann", 10000, "IT");
		Employee manager = new Manager("Musterking", 30000, 200000);
		
		company.onboard(clerk);
		company.onboard(departmentHead);
		company.onboard(manager);

		print(company);

		company.offboard(manager);
		print(company);
	}

	private static void print(Company company) {
		company.printSalaries();
		System.out.println("Lohnsumme: " + company.getTotalSalary());
		System.out.println();
	}
}
