package projectone;
//This will import JUnit method for tests
import static org.junit.jupiter.api.Assertions.*;

//This will import JUnit @Test
import org.junit.jupiter.api.Test;


public class ContactTest {
	
	//This is the test to check that a Contact can be added
	@Test
	public void testValidContact() {
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		

		//This will verify the ID is stored
		assertEquals("00001", contact.getContactId());
		
		//This will verify the first name is stored
		assertEquals("Gaelyn", contact.getFirstName());
		
		//This will verify the last name is stored
		assertEquals("Jackson", contact.getLastName());
		
		//This will verify the phone number is stored
		assertEquals("5555555555", contact.getPhone());
		
		//This will verify the address is stored
		assertEquals("001 This Way", contact.getAddress());
	}
	
	//This will test that a null contact ID is not accepted
	@Test
	public void testNullContactId() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact(null, "Gaelyn", "Jackson", "5555555555", "001 This Way");
		});
	}
	
	//This will test that a ID over 10 characters is not accepted
	@Test
	public void testlongContactId() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact("00000000001", "Gaelyn", "Jackson","5555555555", "001 This Way");
		});
	}
	
	//This will test that a null first name is not accepted
	@Test
	public void testNullFirstName() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact("00001", null, "Jackson", "5555555555", "001 This Way");
		});
	}
	
	//This will test that a first name over 10 characters is not accepted
	@Test
	public void testlongFirstName() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact ("00001", "Gaaeellyynn", "Jackson", "5555555555", "001 This Way");
		});
	}
	
	//This will test that a null last name is not accepted
	@Test
	public void testNullLastName() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact("00001", "Gaelyn", null, "5555555555", "001 This Way");
		});
	}
	
	//This will test that a last name over 10 characters is not accepted
	@Test
	public void testlongLastName() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact ("00001", "Gaelyn", "Jaacksooonn", "5555555555", "001 This Way");
		});
	}
	
	//This will test that a null phone number is not accepted
	@Test
	public void testNullPhone() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact("0001", "Gaelyn", "Jackson", null, "001 This Way");
		});
	}
	
	//This will test that a phone number with less than 10 digits is not accepted
	@Test
	public void testshortPhone() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact("0001", "Gaelyn", "Jackson", "555555555", "001 This Way");
		});
	}
	
	//This will test that a phone number with more than 10 digits is not accepted
	@Test
	public void testlongPhone() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact("00001", "Gaelyn", "Jackson", "55555555555", "001 This Way");
		});
	}
	
	//This will test that a phone number with non-digit characters is not accepted
	@Test
	public void testletterPhone() {
		//This will verify that there is an error 
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact("00001", "Gaelyn", "Jackson", "555555BEEP", "001 This Way");
		});
	}
	
	//This will test that a null address is not accepted
	@Test
	public void testNullAddress() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact("00001", "Gaelyn", "Jackson", "5555555555", null);
		});
	}
	
	//This will test that a address is not longer than 30 characters
	@Test
	public void testlongAddress() {
		//This will verify that there is an error
		assertThrows(IllegalArgumentException.class, () -> {
			//Fake Contact information
			new Contact("00001", "Gaelyn", "Jackson", "5555555555", "0001 I Live This WaY Down The Hill And To The Right");
		});
	}
	
	//This will test that the first name can be updated
	@Test
	public void testupdateFirstName() {
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson","5555555555", "0001 This Way");
		
		//New first name
		contact.setupdateFirstName("Wayde");
		//This checks that the first name was updated
		assertEquals("Wayde", contact.getFirstName());
	}
	
	//This will test that the last name can be updated
	@Test
	public void testupdateLastName() {
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//New last name
		contact.setupdateLastName("Tinsley");
		//This checks that the last name was updated
		assertEquals("Tinsley", contact.getLastName());
	}
	
	//This will test that the phone number can be updated
	@Test
	public void testupdatePhone() {
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//New phone number
		contact.setupdatePhone("4444444444");
		//This checks that the phone was updated
		assertEquals("4444444444", contact.getPhone());
	}
	
	//This will test that the address can be updated
	@Test
	public void tesupdateAddress() {
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//New address
		contact.setupdateAddress("111 That Way");
		//This checks that the address was updated
		assertEquals("111 That Way", contact.getAddress());
	}
	
	//This will test that an updated first name over 10 characters is not accepted
	@Test 
	public void testupdateLongFirstName() {
		//Fake Contact information
		Contact contact = new Contact("00001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//This will show an error
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setupdateFirstName("Maxamillion");
		});
	}
	
	//This will test that an updated phone number that is not 10 digits is not accepted
	@Test
	public void testupdateInvalidPhone () {
		//Fake Contact information
		Contact contact = new Contact("0001", "Gaelyn", "Jackson", "5555555555", "001 This Way");
		
		//his will show an error
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setupdatePhone("00000000");
		});
	}
}
