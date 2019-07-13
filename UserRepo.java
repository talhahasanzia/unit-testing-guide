package com.munchies.customer.auth.register.presenters;

public interface UserRepo {
    void save(User user);
    void clearCache();
}
