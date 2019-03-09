package org.max.wschat.api.controller;

import org.max.wschat.constants.Endpoints;
import org.max.wschat.model.User;
import org.max.wschat.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping(Endpoints.User.ADD_USER)
    public ResponseEntity<User> addUser(@Valid @ModelAttribute User user) {
        final User addedUser = this.userService.addUser(user);
        return new ResponseEntity<>(addedUser, HttpStatus.OK);
    }

    @GetMapping(Endpoints.User.GET_USER)
    public ResponseEntity<User> getUserByUsername(final String username) {
        final User user = this.userService.findUserByUserName(username);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


}
