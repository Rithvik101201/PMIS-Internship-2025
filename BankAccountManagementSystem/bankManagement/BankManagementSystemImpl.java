package bankManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankManagementSystemImpl implements BankManagementSystem{
	
Map<String, List<BankAccountHolder>> customerDataMap = new HashMap<>();
	
	@Override
	public String toString() {
		return "BankManagementSystemImpl [customerDataMap=" + customerDataMap + "]";
	}
 
	@Override
	public void addCustomerType(String type) {
		customerDataMap.putIfAbsent(type, new ArrayList());		
	}
 
	@Override
	public void addAccountHolder(String type, BankAccountHolder holder) {
		if(!customerDataMap.containsKey(type)) {
			System.out.println("Customer type not found. Please add the type first!");
			return;
		}
		customerDataMap.get(type).add(holder);
		
	}
 
	@Override
	public void displayAll() {
		System.out.println(customerDataMap);
		
	}

}