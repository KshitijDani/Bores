
/**
 * Write a description of class CreateFriendshipTest here.
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

public class CreateFriendshipTest
{
    // instance variables - replace the example below with your own
   
    private Facebook fb = new Facebook();
    
    public CreateFriendshipTest()
    {
       
    }

    @Before
    public void setUp(){}
    
    @After
    public void tearDown(){}
    
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
        
       
    }
    
}
