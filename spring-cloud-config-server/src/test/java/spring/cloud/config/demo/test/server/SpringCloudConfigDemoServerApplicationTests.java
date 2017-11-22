package spring.cloud.config.demo.test.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration // test added
public class SpringCloudConfigDemoServerApplicationTests {

    @Test
    public void contextLoads() {}

}
