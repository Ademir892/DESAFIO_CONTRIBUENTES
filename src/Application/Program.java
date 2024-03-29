package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxpayer = new ArrayList<>();
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		System.out.println();
		for(int i=1; i<=n; i++) {
			System.out.println("Digite os dados do " + i + "o contribuinte: ");
			System.out.print("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double healtSpending = sc.nextDouble();
			System.out.println("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			taxpayer.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healtSpending, educationSpending));	
		}
		
		double impostoBruto = ((TaxPayer) taxpayer).grossTax();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Resumo do " + i + "o contribuente:");
			System.out.println("Imposto bruto total: " + impostoBruto);
			System.out.println("Abatimento: " + ((TaxPayer) taxpayer).taxRebate());
			System.out.println("Imposto devido: " + ((TaxPayer) taxpayer).netTax());
		}
		
		
		
		sc.close();
	}

}
