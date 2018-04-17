package com.sunmoong.starter;

/**
 * Created by G05326 on 2018/4/17.
 */
public class HelloService {

    private String msg;

    public String sayHello(){
        return "hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
