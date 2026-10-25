package projectone;
//I believe using Hash map would help with storing the contacts in the memory
import java.util.HashMap;
//I believe using Map will help with structuring the stored contacts
import java.util.Map;


public class ContactService {
	
	//This will create a memory Map that stores contacts
	private final Map<String, Contact> contacts;
	
	//Constructor for the ContactService class
	public ContactService() {
		
		//This will create an empty HashMap with a contact is made
		contacts = new HashMap<>();
	}
	
	//This will add a new contact
	public void addContact(Contact contact) {
		
		//This will check if the contact is null
		if (contact == null) {
			//This will show an error message
			throw new IllegalArgumentException("Contact cannot be null.");
		}
		
		//This gets the ID from the contact and sees if it already exists
		if (contacts.containsKey(contact.getContactId())) {
			//This will show an error message
			throw new IllegalArgumentException("Contact ID already exists.");
		}
		//This will add the contact to the Map 
		contacts.put(contact.getContactId(), contact);
	}
	
	//This will delete a contact
	public void deleteContact(String contactId) {
		
		//This will check if the ID is null
		if (contactId == null) {
			//This will show a error message
			throw new IllegalArgumentException("Contact ID is null.");
		}
		//This checks if the Map has the ID
		if(!contacts.containsKey(contactId)) {
			//This will show a error message
			throw new IllegalArgumentException("Contact doesn't exist.");
		}
		//This will remove the contact
		contacts.remove(contactId);
	}
	
	//This will update the firstName
	public void updateFirstName(String contactId, String firstName) {
		
		//This will find the contact by the ID
		Contact contact = getContact(contactId);
		//This will update the firstName and validates it
		contact.setupdateFirstName(firstName);
	}
	
	//This will update the lastName
	public void updateLastName(String contactId, String lastName) {
		
		//This will find the contact by the ID
		Contact contact = getContact(contactId);
		//This will update the lastName and validates it
		contact.setupdateLastName(lastName);
	}
	
	//This will update the phone
	public void updatePhone(String contactId, String phone) {
		
		//This will find the contact by the ID
		Contact contact = getContact(contactId);
		//This will update the phone and validates it
		contact.setupdatePhone(phone);
	}
	
	//This will update the address
	public void updateAddress(String contactId, String address) {
		
		//This will find the contact by the ID
		Contact contact = getContact(contactId);
		//This will update the address and validates it
		contact.setupdateAddress(address);
	}
	
	//Private method to find the contact by ID
	private Contact getContact(String contactId) {
		
		//This will check if he conactId is null
		if (contactId == null) {
			//This will show an error message
			throw new IllegalArgumentException("Contact ID is null.");
		}
		
		//Finds the contact with the ID
		Contact contact = contacts.get(contactId);
		//This will see if the contact was found
		if (contact == null) {
			//This will show an error message
			throw new IllegalArgumentException("Contact doesn't exist.");
		}
		//Returns the contact
		return contact;
	}
}
