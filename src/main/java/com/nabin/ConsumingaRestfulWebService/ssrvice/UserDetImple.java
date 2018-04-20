package com.nabin.ConsumingaRestfulWebService.ssrvice;

import com.nabin.ConsumingaRestfulWebService.resource.UserResource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserDetImple implements UserDet{
    @Override
    public UserResource getResource() {
        RestTemplate restTemplate=new RestTemplate();
        UserResource userResource=restTemplate.getForObject("http://localhost:8080/api/server",
                UserResource.class);
        return userResource;
    }
}
