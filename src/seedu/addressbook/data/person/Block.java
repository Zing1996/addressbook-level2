package seedu.addressbook.data.person;

/**
 * Represents an Address' Block in the Address of the addressbook
 */
public class Block {
	private String value;
	
	public Block(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
