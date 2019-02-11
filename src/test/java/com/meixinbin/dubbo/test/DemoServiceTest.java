package com.meixinbin.dubbo.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.meixinbin.dubbo.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoServiceTest {

    @Reference(version = "1.0")
    private DemoService demoService;

    @Test
    public void testHello(){
        demoService.hello();
    }
}
