package seedu.addressbook.data.person;

/**
 * Represents an Address' Unit in the Address of the addressbook
 */
public class Unit {
	private String value;
	
	public Unit(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
