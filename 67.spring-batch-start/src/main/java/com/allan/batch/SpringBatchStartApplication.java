package com.allan.batch;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author miss of spring
 */
@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchStartApplication {

    public static void main(String[] args) {
        //启动方式1
        //SpringApplication.run(SpringBatchStartApplication.class, args);
        //启动方式2
        SpringApplication springApplication = new SpringApplication(SpringBatchStartApplication.class);
        //设置关闭banner
        //springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

}
