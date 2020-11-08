package Bridge;

import java.util.ArrayList;
import java.util.List;

public class MongoUserRepository implements IUserRepository {
    private User user;
    public MongoUserRepository(String connectionString) {
        user = new User();
        user.address = "Dindigul, Tamil Nadu, India";
        user.email= "test@gmail.com";
        user.id = "#U01";
        user.name="testUser01";
    }
    @Override
    public User getUserById(String id) {
        System.out.println("getUserById called="+ id);
        return user;
    }

    @Override
    public List<User> getUsersByName(String name)
    {
        System.out.println("getUsersByName called="+ name);
        var users = new ArrayList<User>();
        users.add(user);
        return users;
    }

    @Override
    public User updateAddressById(String id, String address) {
        System.out.println("updateAddressById called, id= "+ id + " , address="+ address);
        user.address = address;
        return user;
    }

    @Override
    public User updateUserById(String id, User user) {
        System.out.println("updateUserById called, id=" + id);
        this.user = user;
        return this.user;
    }
}
