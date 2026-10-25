package projectone;
//This will import JUnit method for tests
import static org.junit.jupiter.api.Assertions.*;

//This will import JUnit @Test
import org.junit.jupiter.api.Test;


public class ContactServiceTest {
	
	//This will test that a contact can be added to ContactService
	@Test
	public void testAddContact() {
		//This will make a new ConactService
		ContactService service = new ContactService();
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//This will add the contact
		service.addContact(contact);
		//This will update the contact
		service.updateFirstName("00001", "Wayde");
	}
	
	//This will test that two contacts don't have the same ID
	@Test
	public void testduplicateContactId() {
		//Fake Contact information 1
		Contact contact1 = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//Fake Contact information 2
		Contact contact2 = new Contact("00001", "Wayde", "Tinsley", "4444444444", "002 That Way");
		
		//This will make a new ContactService
		ContactService service = new ContactService();
		//This will add the first contact
		service.addContact(contact1);
		//This will show an error
		assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(contact2);
		});
	}
	
	//This will test that a contact can be deleted
	@Test
	public void testdeleteContact() {
		//This will make a new ContactService
		ContactService service = new ContactService();
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//This will add the contact
		service.addContact(contact);
		//This will delete the contact by its ID
		service.deleteContact("00001");
		//This will check that contact 2 will be deleted
		assertThrows(IllegalArgumentException.class, () -> {
			service.updateFirstName("00001", "Wayde");
		});
	}
	
	//This will test that the deletion doesn't cause an error
	@Test
	public void testdeletedContact() {
		//This will make a new ContactService
		ContactService service = new ContactService();
		//This will check that an error shows when the ID doesn't exist
		assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContact("00000");
		});
	}
	
	//This will test that the first name can be updated through the service
	@Test
	public void testupdateFirstName() {
		//This will create a new ContactService
		ContactService service = new ContactService();
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//This will add the contact
		service.addContact(contact);
		//This will update the first name by the ID
		service.updateFirstName("00001", "Wayde");
		//This will check the first name is updated
		assertEquals("Wayde", contact.getFirstName());
	}
	
	//This will test that the last name can be updated through the service
	@Test
	public void testupdateLastName() {
		//This will create a new ContactService
		ContactService service = new ContactService();
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "0001 This Way");
		
		//This will add the contact
		service.addContact(contact);
		//This will update the last name by the ID
		service.updateLastName("00001", "Tinsley");
		//This will check the last name is updated
		assertEquals("Tinsley", contact.getLastName());
	}
	
	//This will test that the phone number can be updated through the service
	@Test
	public void testupdatePhone() {
		//This will create a new ContactService
		ContactService service = new ContactService();
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//This will add the contact
		service.addContact(contact);
		//This will update the phone number by the ID
		service.updatePhone("00001", "4444444444");
		//This will check that the phone number is updated
		assertEquals("4444444444", contact.getPhone());
	}
	
	//This will test that the address can be updated through the service
	@Test
	public void testupdateAddress() {
		//This will create a new ContactService
		ContactService service = new ContactService();
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//This will add the contact
		service.addContact(contact);
		//This will update the address by the ID
		service.updateAddress("00001", "001 That Way");
		//This will check that the address is updated
		assertEquals("001 That Way", contact.getAddress());
	}
	
	//This will test an invalid updated first name will have an error
	@Test
	public void testupdateinvalidFirstName() {
		//This will create a new ContactService
		ContactService service = new ContactService();
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//This will add the contact
		service.addContact(contact);
		//This will check that a first name with more than 10 characters will show an error
		assertThrows(IllegalArgumentException.class, () -> {
			service.updateFirstName("00001", "Maxamillion");
		});
	}
	
	//This will test that an invalid updated phone number will have an error
	@Test
	public void testupdateinvalidPhone() {
		//This will create a new ContactService
		ContactService service = new ContactService();
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//This will add the contact
		service.addContact(contact);
		//This will check that a phone number that is not 10 digits will show an error
		assertThrows(IllegalArgumentException.class, () -> {
			service.updatePhone("00001", "55555555");
		});
	}
}
