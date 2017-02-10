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

		//Test for same object
		assertTrue(firstPersonName.isSimilar(firstPersonName));

		//Test for different object
		Name secondPersonName = new Name("Tom");
		Name thirdPersonName = new Name("John John");
		Name firstPersonNameDuplicate = new Name("John");
		assertFalse(firstPersonName.isSimilar(secondPersonName));
		assertFalse(firstPersonName.isSimilar(thirdPersonName));
		assertTrue(firstPersonName.isSimilar(firstPersonNameDuplicate));

		//Test for case-sensitivity
		Name firstPersonNameLowerCaps = new Name("john");
		Name firstPersonNameRandomCaps = new Name("JoHn");
		assertTrue(firstPersonName.isSimilar(firstPersonNameLowerCaps));
		assertTrue(firstPersonName.isSimilar(firstPersonNameRandomCaps));
		assertTrue(firstPersonNameLowerCaps.isSimilar(firstPersonNameRandomCaps));

	}

}
