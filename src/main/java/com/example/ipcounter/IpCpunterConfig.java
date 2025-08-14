package com.example.ipcounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
@Configuration
@EnableScheduling
//@EnableConfigurationProperties(IpProperties.class)
@Import({IpProperties.class, WebConfig.class})
public class IpCpunterConfig {
    @Bean
    @ConditionalOnMissingBean
    public Ipcounter ipcounter(){
        return new Ipcounter();
    }
}
