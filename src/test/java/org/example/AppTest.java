package org.example;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 0b477ced68dc34317cb50e8a67805ea4fe747500
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
<<<<<<< HEAD
    public void testSomething() {
        assertTrue(true);
=======
    public void testApp() {
        assertTrue(true);
=======
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
>>>>>>> 9cf83598013e23b5c83c5d24b297fabe922d3579
>>>>>>> 0b477ced68dc34317cb50e8a67805ea4fe747500
    }
}
