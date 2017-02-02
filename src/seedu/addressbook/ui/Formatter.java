package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.MESSAGE_GOODBYE;
import static seedu.addressbook.common.Messages.MESSAGE_INIT_FAILED;
import static seedu.addressbook.common.Messages.MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE;
import static seedu.addressbook.common.Messages.MESSAGE_USING_STORAGE_FILE;
import static seedu.addressbook.common.Messages.MESSAGE_WELCOME;

import java.util.List;

public class Formatter {
	/** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";


    /** Offset required to convert between 1-indexing and 0-indexing.  */
    public static final int DISPLAYED_INDEX_OFFSET = 1;

    /** Format of a comment input line. Comment lines are silently consumed when reading user input. */
    private static final String COMMENT_LINE_FORMAT_REGEX = "#.*";

    public String getCommandPrompt() {
    	return LINE_PREFIX + "Enter command: ";
    }
    
    public String getCommandEntered(String fullInputLine) {
    	return "[Command entered:" + fullInputLine + "]";
    }

    public String getWelcomeMessage(String version, String storageFilePath) {
    	String storageFileInfo = String.format(MESSAGE_USING_STORAGE_FILE, storageFilePath);
        return showToUser(
                DIVIDER,
                DIVIDER,
                MESSAGE_WELCOME,
                version,
                MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE,
                storageFileInfo,
                DIVIDER);
    	
    }
    
    public String getInitFailedMessage() {
    	return showToUser(MESSAGE_INIT_FAILED, DIVIDER, DIVIDER);
    }
    
    public String getGoodbyeMessage() {
    	return showToUser(MESSAGE_GOODBYE, DIVIDER, DIVIDER);
    }
    
    public String showToUser(String... message) {
    	String formattedMessage = "";
        for (String m : message) {
            formattedMessage += (LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX)) + LS;
        }
        
        return formattedMessage;
    }
    
    public String getIndexedListForViewing(List<String> listItems) {
        final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(getIndexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        return formatted.toString();
    }
    
    private static String getIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }
}
