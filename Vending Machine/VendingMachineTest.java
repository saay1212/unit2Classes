

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    { 
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
@Test 
public void testaddToken()
{
VendingMachine vendingtest= new VendingMachine();
vendingtest.addToken(5);
int tokens=vendingtest.returnTokens();
int cans=vendingtest.returnCans();
assertEquals(5,tokens);
assertEquals(995,cans);
}
@Test
public void testfillCan()
{VendingMachine vendingtest=new VendingMachine();
 vendingtest.fillCan(5);
 int cans=vendingtest.returnCans();
 assertEquals(1005,cans);
}

}
