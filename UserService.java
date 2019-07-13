public class UserService implements UserValidator, Response {

    private Request request;
    private UserRepo repo;

    public UserService(Request request, UserRepo repo) {
        this.request = request;
        this.repo = repo;
    }

    public boolean validateUser(User user) {
        return validateId(user.getId()) &&
                validateAge(user.getAge()) &&
                validateName(user.getName()) &&
                validatePostalCode(user.getAddress().getPostalCode());
    }

    public void createUser(User user) {
        request.execute(user, this);
    }

    @Override
    public boolean validateAge(int age) {
        return false;
    }

    @Override
    public boolean validateName(String name) {
        return false;
    }

    @Override
    public boolean validatePostalCode(String postalCode) {
        return false;
    }

    @Override
    public boolean validateId(long id) {
        return false;
    }

    @Override
    public void onSuccess(User user) {
        repo.save(user);
    }

    @Override
    public void onFailure(String message) {
        repo.clearCache();
    }
}
