package io.github.pepuch.javawebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String hello() {
        final String pythonAppResponse = restTemplate.getForObject("/hello", String.class);
        return "Response from python app: " + pythonAppResponse;
    }

}
