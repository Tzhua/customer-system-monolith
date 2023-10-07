package com.customer.beijing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: TZH
 * @Date: 2023-10-07 17:18
 * @Description: 北京客服中心
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "com.customer.beijing.*")
public class BeijingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeijingApplication.class, args);
        log.info("*************************************************************");
        log.info("****************** BEIJING CUSTOMER SERVICE START ******************");
        log.info("*************************************************************");
    }
}
