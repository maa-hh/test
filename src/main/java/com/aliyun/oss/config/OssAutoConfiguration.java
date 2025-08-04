package com.aliyun.oss.config;

import com.aliyun.oss.Service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@Configuration
@EnableConfigurationProperties(OssProperties.class)
@ConditionalOnProperty(prefix = "aliyun.oss", name = "enabled", havingValue = "true", matchIfMissing = true)
public class OssAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public OssService ossService(@Autowired OssProperties ossProperties) {
        return new OssService(ossProperties);
    }
}
