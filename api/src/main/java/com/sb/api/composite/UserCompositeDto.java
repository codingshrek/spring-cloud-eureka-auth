package com.sb.api.composite;

import com.sb.api.user.UserDto;

public class UserCompositeDto {

    private UserDto userDetails;
    private String serviceAddress;

    public UserCompositeDto() {

    }

    public UserCompositeDto(UserDto userDetails, String serviceAddress) {
        this.userDetails = userDetails;
        this.serviceAddress = serviceAddress;
    }

    public UserDto getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDto userDetails) {
        this.userDetails = userDetails;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }
}
