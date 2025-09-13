package bankManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
	
	private static void showMenu() {
		System.out.println("\n=== Bank Account Management Menu==");
		System.out.println("1. Add Customer Type");
		System.out.println("2. Add Account Holder");
		System.out.println("3. Display All");
		System.out.println("4. Exit");
		System.out.println("Enter your choice: ");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BankManagementSystem system = new BankManagementSystemImpl();
		
		while (true) {
			showMenu();
			int choice;
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Customer Type: ");
				system.addCustomerType(sc.nextLine());
				break;
				
			case 2:
				System.out.println("Enter Customer Type: ");
				String type = sc.nextLine();
				System.out.println("Enter Account Holder Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Account Number: ");
				String accNo = sc.nextLine();
				BankAccountHolder bankAccountHolder = new BankAccountHolder(name, accNo);
				system.addAccountHolder(type, bankAccountHolder);
				break;

			case 3:
				system.displayAll();
				break;
				
			case 4:
				System.out.println("Existing... Goodbye!");
				break;
				
				
			default:
				System.out.println("Invalid choice. Try again");
			}
		}
		
	}
}