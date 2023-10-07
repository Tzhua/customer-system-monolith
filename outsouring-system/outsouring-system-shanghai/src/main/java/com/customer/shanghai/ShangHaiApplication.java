package com.customer.shanghai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: TZH
 * @Date: 2023-10-07 17:18
 * @Description: 上海客服中心
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "com.customer.shanghai.*")
public class ShangHaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShangHaiApplication.class, args);
    }
}
