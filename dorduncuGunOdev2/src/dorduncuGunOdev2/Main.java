package dorduncuGunOdev2;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setDateOfBirth("20.11.1991");
		customer.setFirstName("Yasemin");
		customer.setLastName("Günel");
		customer.setNationalityId("15644881215");
		
		customerManager.save(customer);
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		
		MernisSimulation mernisSimulation = new MernisSimulation();
		mernisSimulation.checkIfRealPerson(customer);
		
		
		
	}

}
