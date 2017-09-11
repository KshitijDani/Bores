import java.util.Set;

public interface Person
{
    String getName();
    boolean addFriend(Person friend);
    boolean removeFriend(Person friend);
    Person searchFriend(Person friend);
    Set<Person> getAllFriends();
}