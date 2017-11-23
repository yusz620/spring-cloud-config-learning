package spring.cloud.config.demo.dao.configure;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;


@Configuration
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.java.*.dao");
        Properties properties = new Properties();
        properties.setProperty("mappers", "com.java.dao.BaseDao");
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "Oracle");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }

}

