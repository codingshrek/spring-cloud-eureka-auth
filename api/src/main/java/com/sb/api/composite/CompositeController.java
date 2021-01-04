package com.sb.api.composite;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

public interface CompositeController {

    @GetMapping(value = "/composite-service/user")
    public UserCompositeDto getCompositeUser();

    @GetMapping(value = "/composite-service/test")
    public ResponseEntity<Map<String,String>> test();
}
