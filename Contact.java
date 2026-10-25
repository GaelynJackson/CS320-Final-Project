package projectone;

public class Contact {
	//This will store the unique IDs
	private final String contactId;
	
	//This will store the first name
	private String firstName;
	
	//This will store the last name
	private String lastName;
	
	//This will store the phone number
	private String phone;
	
	//This will store the address
	private String address;
	
	//Constructor for new Contact objects
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		
		//This will check that contactId is not null and not longer than 10 characters
		if (contactId == null || contactId.length() > 10) {
			//This will give an error message
			throw new IllegalArgumentException("Contact ID cannot be null or more than 10 characters.");
		}
		//This will check that firstName is not null and not longer than 10 characters
		if (firstName == null || firstName.length() > 10) {
			//This will give an error message
			throw new IllegalArgumentException("First name cannot be null or more than 10 characters.");
		}
		//This will check that lastName is not null and not longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			//This will give an error message
			throw new IllegalArgumentException("Last name cannot be null or more than 10 characters.");
		}
		//This will check that phone is not null and is exactly 10 digits
		if (phone == null || !phone.matches("\\d{10}")) {
			//This will give an error message
			throw new IllegalArgumentException("Phone number cannot be null and must be 10 digits.");
		}
		//This will check that address is not null and is not longer than 30 characters
		if (address == null || address.length() > 30) {
			//his will give an error message
			throw new IllegalArgumentException("Address cannot be null or more than 30 characters.");
		}
		
		//This will store the conactId
		this.contactId = contactId;
		
		//This will store the firstName
		this.firstName = firstName;
		
		//This will store the lastName
		this.lastName = lastName;
		
		//This will store the phone
		this.phone = phone;
		
		//This will store the address
		this.address = address;
	}
	
	//This will return the contactId
	public String getContactId() {
		return contactId;
	}
	
	//This will return the firstName
	public String getFirstName() {
		return firstName;
	}
	
	//This will let the firstName be updated
	public void setupdateFirstName(String firstName) {
		//This uses the same rules for firstName not null and not longer than 10 characters
		if (firstName == null || firstName.length() > 10) {
			//This will show an error message
			throw new IllegalArgumentException("First name cannot be null or more than 10 characters.");
		}
		//This stores the updated first name
		this.firstName = firstName;
	}
	
	//This will return the lastName
	public String getLastName() {
		return lastName;
	}
	
	//This will let the lastName be updated
	public void setupdateLastName(String lastName) {
		//This uses the same rules for lastName not null and not longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			//This will show an error message
			throw new IllegalArgumentException("Last name cannot be null or more than 10 characters.");
		}
		//This stores the updated last name
		this.lastName = lastName;
	}
	
	//This will return the phone
	public String getPhone() {
		return phone;
	}
	
	//This will let the phone be updated
	public void setupdatePhone(String phone) {
		//This uses the same rules for phone not null and exactly 10 digits
		if (phone == null || !phone.matches("\\d{10}")) {
			//This will show an error message
			throw new IllegalArgumentException("Phone number cannot be null and must be 10 digits.");
		}
		//This stores the updated phone number
		this.phone = phone;
	}
	
	//This will return the address
	public String getAddress() {
		return address;
	}
	
	//This will let the address be updated
	public void setupdateAddress(String address) {
		//This uses the same rules for address not null and not longer than 30 characters
		if (address == null || address.length() > 30) {
			//This will show an error message
			throw new IllegalArgumentException("Address cannot be null or more than 30 characters.");
		}
		//This stores the updated address
		this.address = address;
	}
}