package org.yfr.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SampleTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleTaskApplication.class, args);
    }

}