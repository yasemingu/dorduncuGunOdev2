package dorduncuGunOdev2;

public class MernisSimulation implements IPersonCheckService{
@Override
public boolean checkIfRealPerson(Customer customer) {
	  if (!customer.getNationalityId().isEmpty()) {
          System.out.println("Müþteri bilgisi doðrulandý.");
	return true;
}
	  else {
          System.out.println("Müþteri bilgisi doðrulanamadý, T.C. Kimlik Numarasý boþ býrakýlamaz.");
          return false;
}
}}