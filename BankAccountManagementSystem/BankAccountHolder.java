package bankManagement;

public class BankAccountHolder {
	
	private String name;
	private String accountNumber;
	
	public BankAccountHolder(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccountHolder [name=" + name + ", accountNumber=" + accountNumber + "]";
	}

}