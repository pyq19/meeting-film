package com.stylefeng.guns.rest;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.api.user.UserAPI;
import org.springframework.stereotype.Component;

@Component
public class Client {

    @Reference(interfaceClass = UserAPI.class, check = false)
    private UserAPI userAPI;

    public void run() {
        userAPI.login("admin", "pass");
    }
}
