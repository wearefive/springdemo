package cn.bllli.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @RequestMapping(method = RequestMethod.GET, path = "/todo")
    public String getTodo(){
        return "hello world";
    }

}
