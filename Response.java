package com.munchies.customer.auth.register.presenters;

public interface Response {
    void onSuccess(User user);
    void onFailure(String message);
}
