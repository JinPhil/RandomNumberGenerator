package com.jinphil.random.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomResource {

    @RequestMapping("/Hello")
    public String hello(){
        return "Hello !";

    }
}
