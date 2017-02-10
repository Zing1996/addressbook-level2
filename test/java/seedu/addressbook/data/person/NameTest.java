package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NameTest {

	@Test
	public void isSimilar() {
		assertFalse(Name.isSimilar(null));
	}

}
