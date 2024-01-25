package entities;

public class TaxPayer {

	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healtSpending;
	private double educationSpending;
	public double capitalTax;
	public double serviceTax;
	public double salaryTax;
	public double grossTax;
	public double limitTax;
	public double totalSpend;
	public double abatement;
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healtSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healtSpending = healtSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealtSpending() {
		return healtSpending;
	}

	public void setHealtSpending(double healtSpending) {
		this.healtSpending = healtSpending;
	}

	public double getEducaionSpending() {
		return educationSpending;
	}

	public void setEducaionSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	
	public void salaryTax() {
		salaryIncome += salaryIncome / 12;
		if(salaryIncome < 3000.0) {
			salaryTax = 0;
		}
		else if(salaryIncome >= 3000.0 || salaryIncome < 5000.0) {
			salaryTax = salaryIncome * 0.10;
		}
		else {
			salaryTax += salaryIncome * 0.2;
		}
		}
	
	public void servicesTax() {
		if(servicesIncome != 0) {
			serviceTax += servicesIncome * 0.15;
		}
		else {
			serviceTax = 0;
		}
	}
	
	public double capitalTax() {
		if(capitalIncome != 0) {
			return capitalTax = capitalIncome * 0.2;
		}
		else {
			return capitalTax = 0;
		}
	}
	
	public double grossTax() {
		return grossTax = capitalTax + serviceTax + salaryTax;
	}
	
	public double taxRebate() {
		limitTax = grossTax * 0.3;
		totalSpend = healtSpending + educationSpending;
		if (limitTax < totalSpend) {
			return abatement = grossTax - limitTax;
		}
		else {
			return abatement = totalSpend;
		}
	}
	
	public double netTax() {
		return grossTax += grossTax - abatement;
	}
}
