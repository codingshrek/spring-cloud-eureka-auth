package com.sb.api.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserController {

    @GetMapping(value = "/v1/user")
    public UserDto getUser();
}
