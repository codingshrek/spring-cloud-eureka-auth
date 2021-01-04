package com.sb.composite.service;

import com.sb.api.composite.CompositeController;
import com.sb.api.composite.UserCompositeDto;
import com.sb.api.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CompositeControllerImpl implements CompositeController {


    RestTemplate restTemplate;
    private String userServiceURL = "http://user-service";


    @Autowired
    public CompositeControllerImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

    }

    @Override
    public UserCompositeDto getCompositeUser() {
        UserDto user = restTemplate.getForObject(userServiceURL+"/v1/user", UserDto.class);
        UserCompositeDto userCompositeDtoposite = new UserCompositeDto(user, "dummyService");
        return userCompositeDtoposite;
    }

    @Override
    public ResponseEntity<Map<String, String>> test() {
        Map<String,String> test = new HashMap<>();
        test.put("Name","Akash");
        return new ResponseEntity<>(test, HttpStatus.OK);
    }


}
