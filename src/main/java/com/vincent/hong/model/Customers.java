package com.vincent.hong.model;

import java.util.Date;

/**
 * Created by vincent.hong on 2017/9/2.
 */
public class Customers {

    private  Integer id ;
    private  String cus_code;

    private String cus_name;

    private  String password;

    private  String status;

    private  String mphone;

    private  String addr;

    private  String email;

    private Date create_dt;



    public String getCus_code() {
        return cus_code;
    }

    public void setCus_code(String cus_code) {
        this.cus_code = cus_code;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(Date create_dt) {
        this.create_dt = create_dt;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "cus_code='" + cus_code + '\'' +
                ", cus_name='" + cus_name + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", mphone='" + mphone + '\'' +
                ", addr='" + addr + '\'' +
                ", email='" + email + '\'' +
                ", create_dt=" + create_dt +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
