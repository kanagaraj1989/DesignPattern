package Bridge;

public class AuthService {
    private IUserRepository userRepository;
    public AuthService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String authenticate(String emailId, String password) {
        System.out.println("Fetch user by emailId and validate user name & password");
        var user = userRepository.getUserById(emailId);
        System.out.println("name="+ user.name + ", id " + user.id + ", email="+ user.email + ", address="+ user.address );
        return "api-tok";
    }

}
