package ru.asm0dey.utorrentaccess.utorrentclient;

import junit.framework.Test;
import org.netbeans.junit.NbModuleSuite;
import org.netbeans.junit.NbTestCase;

import java.util.logging.Level;

public class ApplicationTest extends NbTestCase {

	public static Test suite() {
		return NbModuleSuite.createConfiguration( ApplicationTest.class ).gui(false).failOnMessage(Level.WARNING). // works at least in RELEASE71
				failOnException(Level.INFO).suite(); // RELEASE71+, else use NbModuleSuite.create(NbModuleSuite.createConfiguration(...))
	}

	public ApplicationTest( String n ) {
		super( n );
	}

	public void testApplication() {
		// pass if there are merely no warnings/exceptions
		/* Example of using Jelly Tools with gui(true):
		new ActionNoBlock("Help|About", null).performMenu();
		new NbDialogOperator("About").closeByButton();
		 */
	}

}