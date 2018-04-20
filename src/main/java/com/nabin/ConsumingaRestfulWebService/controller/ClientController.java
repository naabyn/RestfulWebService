package com.nabin.ConsumingaRestfulWebService.controller;

import com.nabin.ConsumingaRestfulWebService.resource.UserResource;
import com.nabin.ConsumingaRestfulWebService.ssrvice.UserDet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")

public class ClientController {
    private final UserDet userDet;

    public ClientController(UserDet userDet) {
        this.userDet = userDet;
    }


    @GetMapping(value = "/server")
    public UserResource getDetails(){
        return userDet.getResource();

    }

}
