package com.vincent.hong.service.impl;

import com.vincent.hong.dao.CustomerMapper;
import com.vincent.hong.model.Customers;
import com.vincent.hong.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by vincent.hong on 2018/1/28.
 */
@Service(value = "customersService")
public class CustomearsServiceImpl implements CustomersService {
    @Resource
    private CustomerMapper customerMapper;

    @Override
    public Customers selectByCusId(Integer id) {
        return customerMapper.selectOneByCusCode(id);
    }
}
