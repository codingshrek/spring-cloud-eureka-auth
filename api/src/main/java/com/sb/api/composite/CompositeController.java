package com.sb.api.composite;


import org.springframework.web.bind.annotation.GetMapping;

public interface CompositeController {

    @GetMapping(value = "/v1/composite-user")
    public UserCompositeDto getCompositeUser();
}
