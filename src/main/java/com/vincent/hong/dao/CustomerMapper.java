package com.vincent.hong.dao;


import com.vincent.hong.model.Customers;

/**
 * Created by vincent.hong on 2017/9/2.
 */
public interface CustomerMapper {

    Customers selectOneByCusCode(Integer  id);

}
