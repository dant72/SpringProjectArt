package com.example.SpringProjectArt;
import javax.servlet.http.HttpServlet;

import com.example.SpringProjectArt.servlet.MyServlet;
import org.hibernate.service.spi.InjectService;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public ServletRegistrationBean<HttpServlet> countryServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new MyServlet());
        servRegBean.addUrlMappings("/my/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
}
