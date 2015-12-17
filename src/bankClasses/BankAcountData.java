package bankClasses;

public class BankAcountData {

	String title;
	String firstname;
	String lastname;
	String country;
	String city;
	String postalCode;
	String Street;
	String iban;
	public BankAcountData(String title, String firstname, String lastname, String country, String city,
			String postalCode, String street, String iban) {
		super();
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
		Street = street;
		this.iban = iban;
	}
	public String getTitle() {
		return title;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public String getStreet() {
		return Street;
	}
	public String getIban() {
		return iban;
	}
	
	
}
