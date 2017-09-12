
/**
 * Write a description of class ProfileTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProfileTest
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class ProfileTest
     */
    public ProfileTest()
    {
        // initialise instance variables
       
    }
    
     @Test
    public void friendsRemovedProperly()
    {
        Profile p1,p2;
        p1 = new Profile("kshitij");
        p2 = new Profile("dani");
        
        p1.addFriend(p2);
        p2.addFriend(p1);
        
        assertEquals(true, p1.removeFriend(p2));
       
        assertEquals(false, p1.removeFriend(p2));
       
        assertEquals(true, p2.removeFriend(p1));
        
        // put your code here
        
    }
    
    @Test
    public void friendsAddedProperly()
    {
        Profile p1,p2;
        p1 = new Profile("kshitij");
        p2 = new Profile("dani");
        
        assertEquals(true, p1.addFriend(p2));        
        assertEquals(true, p1.addFriend(null));
        assertEquals(false, p1.addFriend(p2));
        assertEquals(true,p2.addFriend(p1));
        assertNotNull("kshitij and dani are friends", p1.searchFriend("dani"));
        
        
        
        // put your code here
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
