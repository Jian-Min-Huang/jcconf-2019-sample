package org.yfr.task.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = {
        "org.yfr"})
@EnableScheduling
@EnableFeignClients(basePackages = {
        "org.yfr.web.api"})
public class RootConfig {
}
