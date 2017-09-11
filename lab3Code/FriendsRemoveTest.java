
/**
 * Write a description of class FriendsAddedTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.String;

public class FriendsRemoveTest
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class FriendsAddedTest
     */
    public FriendsRemoveTest()
    {
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
}
 