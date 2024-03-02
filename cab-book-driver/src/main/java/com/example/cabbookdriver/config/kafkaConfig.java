package com.example.cabbookdriver.config;

import com.example.cabbookdriver.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaConfig {

    //create bean for topic
    @Bean
    public NewTopic createTopic()
    {
        return TopicBuilder
                .name(AppConstants.CABLOCATION)
                .build();
    }


}
