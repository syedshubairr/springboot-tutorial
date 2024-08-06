package com.dailycodebuffer.Spring_boot_tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//By this RESTController annotation we defined this controller that will only return the response body.
@RestController
public class HelloController {

    //    Now as we can see that this request mapping annotation s kinda hectic and long to maintain.
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    Now by using this GetMapping annotation we can do the same thing very easily.
    @GetMapping("/")
    public String hello() {
        return "Welcome to SpringBoot";
    }

    //We can use PostMapping DeleteMapping basically every rest api type like this. to make things easy.
    @GetMapping("/lo")
    public String loki() {
        return "LOKI";
    }
}
