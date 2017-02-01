package seedu.addressbook.data.person;

/**
 * Represents an Address' Street in the Address of the addressbook
 */
public class Street {
	private String value;
	
	public Street(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
