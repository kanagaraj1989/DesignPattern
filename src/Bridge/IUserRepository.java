package Bridge;

import java.util.List;

public interface IUserRepository {
    public User getUserById(String id);
    public List<User> getUsersByName(String name);
    public User updateAddressById(String id, String address);
    public User updateUserById(String id, User user);
}
