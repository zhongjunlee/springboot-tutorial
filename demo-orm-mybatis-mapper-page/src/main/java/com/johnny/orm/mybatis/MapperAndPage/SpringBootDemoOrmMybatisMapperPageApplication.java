package com.johnny.orm.mybatis.MapperAndPage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2018-11-08 13:43
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.johnny.orm.mybatis.MapperAndPage.mapper"})
public class SpringBootDemoOrmMybatisMapperPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoOrmMybatisMapperPageApplication.class, args);
    }
}
