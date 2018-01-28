package com.vincent.hong.service;

import com.vincent.hong.model.Customers;

/**
 * Created by vincent.hong on 2018/1/28.
 */
public interface CustomersService {
    Customers selectByCusId(Integer id);

}
