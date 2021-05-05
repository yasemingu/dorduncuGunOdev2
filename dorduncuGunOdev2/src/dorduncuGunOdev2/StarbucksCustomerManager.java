package dorduncuGunOdev2;

public class StarbucksCustomerManager extends BaseCustomerManager {

		private IPersonCheckService personCheckService;
		
		public StarbucksCustomerManager(IPersonCheckService personCheckService) {
			this.personCheckService=personCheckService;
		}
		
		
		
		
	@Override
	public void save(Customer customer) {
		
	if (personCheckService.checkIfRealPerson(customer)) {
		save(customer);

			
			
		}
	else {
		System.out.println("Geçersiz bilgi girdiniz.");
	}
		
		
		
	}
	
	
	
}
