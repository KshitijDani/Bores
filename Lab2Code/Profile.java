import java.util.*;
import java.lang.String;
/**
 * Write a description of class Profile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Profile extends java.lang.Object
{
    // instance variables - replace the example below with your own
    private ArrayList<Profile> friends;
    private String name;
    
    
    public Profile(String name1){
        name=name1;
        this.friends = new ArrayList<Profile>();
    }
    
    public String getName(){
        return name;
    }
    
    public Profile searchFriend(String name1){
        
        for(Profile p : friends ){    
            if(p.getName().equals(name1)){
            return p;//Return this object
            }
        }
        return null;
    }
    
    public boolean addFriend(Profile profileName){
        if(friends.contains(profileName)){
            return false;
        }
        else{
            friends.add(profileName);
            return true;
        }
    }
    
    public boolean removeFriend(Profile profileName){
        if(friends.contains(profileName)){
            friends.remove(profileName);
            return true;
        }
        else{
            
            return false;
        }
    }
            
            
    
            
        
        
        


    
    
}
