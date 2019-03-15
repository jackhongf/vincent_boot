package com.vincent.hong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vincent.hong on 2018/1/28.
 */
@RestController
@RequestMapping(value="/test")
public class TestController {
    @RequestMapping("/getStr")
    public String getStr(){


        return "wefwqefqwefw";
    }
}
