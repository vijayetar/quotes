/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void testMainFileNotFound(){
        App classUnderTest = new App();
        assertThrows("this filepath does not exist!", Exception.class, ()-> classUnderTest.printQuote("src/test/resources/x.json"));

    }
    @Test public void testMainOneQuote() throws FileNotFoundException {
        App classUnderTest = new App();
        assertEquals("By  Marilyn Monroe' “I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.” '", classUnderTest.printQuote("src/test/resources/testOneQuote.json"));
    }
}