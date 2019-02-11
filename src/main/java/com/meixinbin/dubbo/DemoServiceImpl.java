package com.meixinbin.dubbo;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public void hello() {
        System.out.println("hello dubbo !!");
    }
}
