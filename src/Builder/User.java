package Builder;

public class User {
    private String id;
    private String name;
    private String email;
    private String phoneNo;

    private User(UserBuilder builder) {
        this.id = "my_id ="+builder.id;
        this.email = builder.email;
        this.name = builder.name;
        this.phoneNo = builder.phoneNo;
    }
    public String getId() { return this.id;}
    public String getName() {return  this.name;}
    public String getEmail() {return this.email;}
    public String getPhoneNo() {return this.phoneNo;}

    public static class UserBuilder {
        private String id;
        private String name;
        private String email;
        private String phoneNo;

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
