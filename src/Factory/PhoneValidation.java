package Factory;

public class PhoneValidation implements Validation {
    private String phone;
    public PhoneValidation(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean validate() {
        System.out.println("phone validation called");
        return true;
    }
}
