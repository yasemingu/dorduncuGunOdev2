package dorduncuGunOdev2;

public class BaseCustomerManager implements ICustomerService {
@Override
public void save(Customer customer) {
	System.out.println("Veritaban�na kaydedildi : " + customer.getFirstName()); 
	
}
}
