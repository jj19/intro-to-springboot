
package com.tts.SpringSite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Configuration

public class ThymeleafConfig {

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("classpath:/templates/"); // Location of your HTML templates
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(false); // For development, set to false
        return templateResolver;
    }
}
