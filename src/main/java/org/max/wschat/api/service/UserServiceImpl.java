package org.max.wschat.api.service;

import org.max.wschat.api.repository.UserRepository;
import org.max.wschat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User findUserByUserName(String username) {
        return this.userRepository.findUserByUsername(username);
    }
}
