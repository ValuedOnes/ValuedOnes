package com.valuedones;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.valuedones.mapper")
public class ValuedOnesApplication {
    public static void main(String[] args) {
        SpringApplication.run(ValuedOnesApplication.class, args);
    }
}
