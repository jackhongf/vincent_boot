package com.vincent.hong.controller;

import com.vincent.hong.model.Customers;
import com.vincent.hong.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vincent.hong on 2018/1/28.
 */
@RestController
@RequestMapping(value="/test")
public class TestController {
    @Autowired
    private CustomersService  customersService;

    @GetMapping(value = "/index/{id}")
    public Customers index(@PathVariable(value = "id") Integer id){
        return customersService.selectByCusId(id);
    }
}
