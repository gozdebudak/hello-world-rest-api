package com.gozdebudak.rest.webservices.helloworldrestapi.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    //*There is a better way to do it*/
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World!");
    }
}
