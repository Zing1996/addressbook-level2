package seedu.addressbook.data.tag;

import java.util.ArrayList;

import seedu.addressbook.data.person.Person;

public class Tagging {
	public static enum TaggingOperation{
		ADD, DELETE
	}
	
	public static final String ADD_OPERATION = "+";
	public static final String DELETE_OPERATION = "-";
	
	public static ArrayList<Tagging> taggingList = new ArrayList<Tagging>();
	
	private Person person;
	private Tag tag;
	private TaggingOperation type;
	
	/**
	 * 
	 * Creates new tagging 
	 */
	public Tagging(Person person, Tag tag, TaggingOperation type) {
		this.person = person;
		this.tag = tag;
		this.type = type;
	}
	
	/**
	 * 
	 * Creates new tagging to add to taggingList with ADD operation
	 */
	public static void addTag(Person person, Tag tag) {
		taggingList.add(new Tagging(person, tag, TaggingOperation.ADD));
	}
	
	/**
	 * 
	 * Creates new tagging to add to taggingList with DELETE operation
	 */
	public static void deleteTag(Person person, Tag tag) {
		taggingList.add(new Tagging(person, tag, TaggingOperation.DELETE));
	}
	
	/**
	 * 
	 * Returns operation in String format
	 */
	public String getOperation() {
		return type == TaggingOperation.ADD ? "+" : "-";
	}
	
	
	
	@Override
	public String toString() {
		return getOperation() + " " + person.getName() + " [" + tag.toString() + "]";
	}
}
