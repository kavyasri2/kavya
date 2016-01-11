package employeepayment;
public class Person {

	private String firstname;
	private String lastname;
	private double hourlyrate1;
	/**
	 * 
	 */
	public Person() {
	this.firstname = "kavya";
	this.lastname = "peechara";
	this.hourlyrate1 = 20;
	}
	/**
	 * @param firstname
	 * @param lastname
	 * @param hourlyrate1
	 */
	public Person(String firstname, String lastname, double hourlyrate1) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.hourlyrate1 = hourlyrate1;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the hourlyrate1
	 */
	public double getHourlyrate() {
		return hourlyrate1;
	}
	/**
	 * @param hourlyrate the hourlyrate1 to set
	 */
	public void setHourlyrate(double hourlyrate) {
	}
	/**
	 * 
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", hourlyrate=" + hourlyrate1 + "]";
	}
	public double getpayment(int hours){
		return this.hourlyrate1*hours;
	}
}