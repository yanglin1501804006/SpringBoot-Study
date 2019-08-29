package com.yanglin.controller;

import com.yanglin.bean.BlogProperties;
import com.yanglin.bean.ConfigBean;
import com.yanglin.bean.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping("/testConfigBean")
    String indexTestConfigBean() {
        return testConfigBean.getName() + "，" + testConfigBean.getAge();
    }

    @RequestMapping("/configBean")
    String indexConfigBean() {
        return configBean.getWholeTitle();
    }

    @RequestMapping("/blogProperties")
    String indexblogProperties() {
        return blogProperties.getName() + "," + blogProperties.getTitle();
    }

}
