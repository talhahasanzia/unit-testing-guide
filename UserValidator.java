public interface UserValidator {
    boolean validateAge(int age);
    boolean validateName(String name);
    boolean validatePostalCode(String postalCode);
    boolean validateId(long id);
}
