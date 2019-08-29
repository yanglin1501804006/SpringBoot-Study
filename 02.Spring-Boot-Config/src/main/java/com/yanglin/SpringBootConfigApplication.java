package com.yanglin;

import com.yanglin.bean.ConfigBean;
import com.yanglin.bean.TestConfigBean;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class,TestConfigBean.class})
public class SpringBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootConfigApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.setAddCommandLineProperties(false);
        app.run(args);
    }

}
