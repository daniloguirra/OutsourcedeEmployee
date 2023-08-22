package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.OutsourcedeEmployee;
import entities.employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)?");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge:: ");
				double additionalCharge = sc.nextDouble();
				
				employee emp = new OutsourcedeEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}else {
				employee emp = new employee(name, hours, valuePerHour);
				list.add(emp);
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for(employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();

	}

}
