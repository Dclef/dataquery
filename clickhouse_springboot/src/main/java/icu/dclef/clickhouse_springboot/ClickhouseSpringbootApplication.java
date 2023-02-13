package icu.dclef.clickhouse_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("icu.dclef.clickhouse_springboot.mapper")
public class ClickhouseSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClickhouseSpringbootApplication.class, args);
    }

}
