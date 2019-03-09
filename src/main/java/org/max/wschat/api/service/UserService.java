package org.max.wschat.api.service;

import org.max.wschat.model.User;

public interface UserService {

    User addUser(User user);

    User findUserByUserName(String username);
}
