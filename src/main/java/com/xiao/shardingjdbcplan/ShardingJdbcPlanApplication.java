package com.xiao.shardingjdbcplan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
@MapperScan(basePackages = {"com.xiao.shardingjdbcplan.mapper"})
public class ShardingJdbcPlanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcPlanApplication.class, args);
    }

}
