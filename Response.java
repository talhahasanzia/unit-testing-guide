public interface Response {
    void onSuccess(User user);
    void onFailure(String message);
}
