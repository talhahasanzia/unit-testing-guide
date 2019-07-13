

public class UserService2 implements UserValidator {

    private Request request;
    private UserRepo repo;
    private Response responseCallback;

    public UserService2(Request request, UserRepo repo, Response response) {
        this.request = request;
        this.repo = repo;
        responseCallback= response;
    }

    public boolean validateUser(User user) {
        return validateId(user.getId()) &&
                validateAge(user.getAge()) &&
                validateName(user.getName()) &&
                validatePostalCode(user.getAddress().getPostalCode());
    }

    public void createUser(User user) {
        request.execute(user, responseCallback);
    }

    @Override
    public boolean validateAge(int age) {
        return true;
    }

    @Override
    public boolean validateName(String name) {
        return true;
    }

    @Override
    public boolean validatePostalCode(String postalCode) {
        return true;
    }

    @Override
    public boolean validateId(long id) {
        return true;
    }

}
