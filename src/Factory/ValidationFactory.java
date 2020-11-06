package Factory;

public abstract class ValidationFactory {
    public static Validation createValidation(String type) throws Exception {
        if (type.equals("Email")) {
            return new EmailValidation("raj@gmail.com");
        }

        if (type.equals("Phone")) {
            return new PhoneValidation("+910123456789");
        }

        throw new Exception("invalid validation type");
    }
}
