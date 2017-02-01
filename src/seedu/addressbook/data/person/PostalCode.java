package seedu.addressbook.data.person;

/**
 * Represents an Address' PostalCode in the Address of the addressbook
 */
public class PostalCode {
	private String value;
	
	public PostalCode(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
