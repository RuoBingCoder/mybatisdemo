package com.springboot.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.springboot.mybatisdemo.dao")
/**
 * 注意一定要加上上面扫描Mapper包
 */

public class MybatisdemoApplication {
    /**
     * 启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(MybatisdemoApplication.class, args);
    }

}
