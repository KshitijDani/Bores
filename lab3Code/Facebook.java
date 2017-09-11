import java.util.ArrayList;
import java.util.Set;

public class Facebook
{
    ArrayList<Person> persons;
    
    public Facebook()
    {
        persons = new ArrayList<>();
    }
    
    public boolean addPerson(Person person)
    {
        return persons.add(person);
    }
    
    public boolean connectFriends(Person one, Person two)
    {
        if(persons.contains(one) && persons.contains(two)) {
            one.addFriend(two);
            two.addFriend(one);
            return true;
        }
        return false;
    }
    
//     public boolean removePerson(Person person)
//     {
//         //person given is not a user
//         if(!persons.contains(person))
//             return false;
//             
//         persons.remove(person);
//         
//         Set<Person> friends = person.getAllFriends();
//         for(Person p : friends)
//             p.removeFriend(person);
//         return true;
//     }
    
    public Set<Person> listFriends(Person person)
    {
        return person.getAllFriends();
    }
}