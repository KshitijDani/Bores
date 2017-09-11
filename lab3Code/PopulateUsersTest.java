
/**
 * Write a description of class PopulateUsersTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PopulateUsersTest
{
    // instance variables - replace the example below with your own
    private Facebook fb = new Facebook();
    private Person mockPerson = mock(Person.class);
    

    /**
     * Constructor for objects of class PopulateUsersTest
     */
    public PopulateUsersTest()
    {    }
    
    @Before
    public void setUp(){}
    
    @After 
    public void tearDown(){}
    
    @Test
    public void PopulateUsers(){
        
        assertEquals(fb.addPerson(mockPerson),true);
        
        
    }

    
    
}