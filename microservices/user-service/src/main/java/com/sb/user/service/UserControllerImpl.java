package com.sb.user.service;

import com.sb.api.user.UserController;
import com.sb.api.user.UserDto;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserControllerImpl implements UserController {

    @Override
    public UserDto getUser() {
        UserDto user = new UserDto("codingshrek","akash.insignia@gmail.com","Akash Yadav");
        return user;
    }
}
