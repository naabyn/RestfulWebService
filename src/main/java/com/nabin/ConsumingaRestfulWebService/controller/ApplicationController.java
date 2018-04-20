package com.nabin.ConsumingaRestfulWebService.controller;

import com.nabin.ConsumingaRestfulWebService.resource.QuoteDto;
import com.nabin.ConsumingaRestfulWebService.ssrvice.ConsumingRestfulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api")
public class ApplicationController {

    private final ConsumingRestfulService consumingRestfulService;
    @Autowired
    public ApplicationController(ConsumingRestfulService consumingRestfulService) {
        this.consumingRestfulService = consumingRestfulService;
    }


    @GetMapping(value = "/consume")
    public QuoteDto gertResource(){

        return consumingRestfulService.getService();
    }
}
