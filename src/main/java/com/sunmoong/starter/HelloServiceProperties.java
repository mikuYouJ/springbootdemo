package com.sunmoong.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by G05326 on 2018/4/17.
 */

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static  final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
