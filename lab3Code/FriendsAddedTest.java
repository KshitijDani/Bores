
/**
 * Write a description of class FriendsAddedTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.String;

public class FriendsAddedTest
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class FriendsAddedTest
     */
    public FriendsAddedTest()
    {
    }

    @Test
    public void friendsAddedProperly()
    {
        Profile p1,p2;
        p1 = new Profile("kshitij");
        p2 = new Profile("dani");
        
        assertEquals(true, p1.addFriend(p2));        
        assertEquals(false, p1.addFriend(p2));
        assertEquals(true,p2.addFriend(p1));
        assertNotNull("kshitij and dani are friends", p1.searchFriend("dani"));
        
        
        
        // put your code here
        
    }
}
