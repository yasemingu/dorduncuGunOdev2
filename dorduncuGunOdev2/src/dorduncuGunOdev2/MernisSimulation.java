package dorduncuGunOdev2;

public class MernisSimulation implements IPersonCheckService{
@Override
public boolean checkIfRealPerson(Customer customer) {
	  if (!customer.getNationalityId().isEmpty()) {
          System.out.println("M��teri bilgisi do�ruland�.");
	return true;
}
	  else {
          System.out.println("M��teri bilgisi do�rulanamad�, T.C. Kimlik Numaras� bo� b�rak�lamaz.");
          return false;
}
}}