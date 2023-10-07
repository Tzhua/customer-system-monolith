package com.tzh.cs;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: TZH
 * @Date: 2023-06-11 17:18
 * @Description: 总公司
 */
@Slf4j
@SpringBootApplication
@MapperScan("com.tzh.cs.mapper")
public class MainApplication {

    @Bean
    public RestTemplate restTemplate() {
        //注入RestTemplate
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        log.info("*************************************************************");
        log.info("****************** CUSTOMER SYSTEM START ******************");
        log.info("*************************************************************");
    }
}
