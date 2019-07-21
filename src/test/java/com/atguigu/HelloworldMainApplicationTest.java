package com.atguigu;

import com.atguigu.dto.Persion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldMainApplicationTest {

    @Autowired
    private Persion persion;

    @Test
    public void testConfiguration(){
        System.out.println(persion);
    }

}
