package employeepayment;

public class Payment {

	public static void main(String[] args) {
		// create a person object
		Person person = new Person();
		person.setFirstname("Padma");
		person.setLastname("Peechara");
		person.setHourlyrate(25);
		
       //print the state of the person object
		System.out.println(person.toString());
	   // get and print the weekly payment
		System.out.println(person.getpayment(40));
	}

}
