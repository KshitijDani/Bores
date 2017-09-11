
/**
 * This class is to creates profile of a person.
 * 
 * @author Ashu Sharma 
 * @version 1.1
 */

import java.util.*;
public class Profile
{
    // instance variables - replace the example below with your own
    /**
     * It stores the name of person.
     */
    private String name;
    /**
     * It stores list of friends. 
     */
    private ArrayList<Profile> friends;
    

    /**
     * Construct an objects of class Profile.
     * It creates a profile of a person with initializing a person name and an empty ArrayList for friends
     */
    public Profile(String name1)
    {
        // initialise instance variables
        this.name=name1;
        this.friends = new ArrayList<Profile>();
    }
    
    /**
     * This method returns the name of a person.
     */
    public String getName() 
    { 
        return name; 
    }

    /**
     * This method add a friend to the friends list of a person and return true 
     * otherwise, if friend is already in list return false.
     */
    public boolean addFriend(Profile profileName) 
    { 
        if(friends.contains(profileName)) {
            return false;
        }
        friends.add(profileName); 
        return true;
    }

    /**
     * This method removes a friend from the friends list of a person and return true 
     * otherwise, if friend does not exist in the list return false.
     */
    public boolean removeFriend(Profile profileName) 
    { 
        if(!friends.contains(profileName)) {
            return false;
        }
        friends.remove(profileName); 
        return true;
    }

    /*public boolean showFriends()
    {
        if(friends.isEmpty()) {
            return false;
        }
        for(Profile f :friends) { 
            System.out.println(f.getName());
        }
        return true;
    }*/
    /**
     * This method check whether a person is friend, If yes then return friends profile object, 
     * otherwise return null.
     */
    public Profile searchFriend(String name)
    {
        for(Profile p :friends) { 
            if (name.equals(p.getName())) {
                return p;
            }
        }
        return null;
     
    }

}