package com.yanglin.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="spring.miss")
@PropertySource(value = "classpath:application.properties",  ignoreResourceNotFound = true,encoding = "UTF-8")
@Component
public class ConfigBean {
	private String name;
	private String title;
	private String wholeTitle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWholeTitle() {
		return wholeTitle;
	}
	public void setWholeTitle(String wholeTitle) {
		this.wholeTitle = wholeTitle;
	}	
	
}
