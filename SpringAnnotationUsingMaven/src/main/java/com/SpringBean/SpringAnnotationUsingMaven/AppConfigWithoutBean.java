package com.SpringBean.SpringAnnotationUsingMaven;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.SpringBean.SpringAnnotationUsingMaven")
public class AppConfigWithoutBean {

}
