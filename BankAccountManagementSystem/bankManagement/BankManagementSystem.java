package bankManagement;

interface BankManagementSystem {
	
	void addCustomerType(String type);
	void addAccountHolder(String type, BankAccountHolder holder);
	void displayAll();

}