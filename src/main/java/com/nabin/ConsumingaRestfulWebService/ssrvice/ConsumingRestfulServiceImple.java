package com.nabin.ConsumingaRestfulWebService.ssrvice;

import com.nabin.ConsumingaRestfulWebService.resource.QuoteDto;
import com.nabin.ConsumingaRestfulWebService.resource.UserResource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumingRestfulServiceImple implements ConsumingRestfulService {

    @Override
    public QuoteDto getService() {
        RestTemplate restTemplate = new RestTemplate();
        QuoteDto quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", QuoteDto.class);
        return quote;
    }

}
