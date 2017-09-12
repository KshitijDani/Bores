
/**
 * Write a description of class FacebookTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FacebookTest
{
    // instance variables - replace the example below with your own
    
    private Facebook fb;
    private Person mockPerson;
    
    @Before 
    public void setUp(){
        fb = new Facebook();
        mockPerson = mock(Person.class);
        
    }
    
    @After
    public void tearDown(){
        fb = null;
        mockPerson = null;
    }
    /**
     * Constructor for objects of class FacebookTest
     */
    public FacebookTest()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Test
    public void PopulateUsers(){
        
        assertEquals(fb.addPerson(mockPerson),true);
        
        
    }
    
    @Test
    public void CreateFriendship(){
        Person p1,p2;
        
        p1 = mock(Person.class);
        p2 = mock(Person.class);
        
        fb.addPerson(p1);
        fb.addPerson(p2);
        
        when(p1.addFriend(p2)).thenReturn(true);
        when(p2.addFriend(p1)).thenReturn(true);
        
           
        
        assertTrue(fb.connectFriends(p1,p2));
        
        verify(p1,times(1)).addFriend(p2);
        verify(p2,times(1)).addFriend(p1);
        
       
    }
}
