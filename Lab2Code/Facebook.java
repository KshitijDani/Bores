import java.util.*;
/**
 * Write a description of class Facebook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Facebook
{
    // instance variables - replace the example below with your own
    private ArrayList<Profile> profiles;

    /**
     * Constructor for objects of class Facebook
     */
    public Facebook()
    {
     this.profiles = new ArrayList<Profile>();   // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean createProfile(String name){
        if(profiles.contains(name)){
            return false;
        }
        else{
            profiles.add(new Profile(name));
            return true;
        }
    }
    
    public Profile searchProfile(String name){
        for(Profile p:profiles){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public boolean deleteProfile(String personName){
        for(Profile p:profiles){
            if(p.getName().equals(personName)){
                profiles.remove(p);
                return true;
            }
        }
        return false;
    }
    public boolean makeFriend(String name1,String name2){
        Profile p1=null,p2=null;
        for(Profile p: profiles){
            if(p.getName().equals(name1)){
                p1=p;
            }
        }
        for(Profile p:profiles){
            if(p.getName().equals(name2)){
                p2=p;
            }
        }
        
        if(p1==null||p2==null){
            return false;
        }
        else{
            p2.addFriend(p1);
            p1.addFriend(p2);
            return true;
        }      
        
   
        
    }
    
    public boolean unFriend(String name1,String name2){
        Profile p1=null,p2=null;
        p1=searchProfile(name1);
        p2=searchProfile(name2);
        if(p1==null || p2==null)
            return false;
            
        else{
            p1.removeFriend(p2);
            p2.removeFriend(p1);
            return true;
        }
    }
    
        
}
