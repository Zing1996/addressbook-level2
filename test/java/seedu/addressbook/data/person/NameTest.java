package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

	@Test
	public void isSimilar() throws IllegalValueException {
		//Test for null 
		Name firstPersonName = new Name("John");
		assertFalse(firstPersonName.isSimilar(null));
	}

}
