package Factory;

public class EmailValidation implements Validation{
    private String email;
    public EmailValidation(String email) {
       this.email = email;
    }

    @Override
    public boolean validate() {
        System.out.println("Email Validation called");
        return true;
    }
}
