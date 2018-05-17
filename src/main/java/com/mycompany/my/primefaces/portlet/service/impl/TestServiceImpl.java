package com.mycompany.my.primefaces.portlet.service.impl;

import com.mycompany.my.primefaces.portlet.service.TestService;

public class TestServiceImpl implements TestService {

    @Override
    public String countWeight(String name, int age, int tall) {
        if (age <= 40) {
            tall = tall - 110;
        } else {
            tall = tall - 100;
        }
        return "Dear " + name + ", your optimal weight is: " + String.valueOf(tall);
    }
}
