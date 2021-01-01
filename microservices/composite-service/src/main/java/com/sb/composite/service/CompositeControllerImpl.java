package com.sb.composite.service;

import com.sb.api.composite.CompositeController;
import com.sb.api.composite.UserCompositeDto;
import com.sb.api.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
}
