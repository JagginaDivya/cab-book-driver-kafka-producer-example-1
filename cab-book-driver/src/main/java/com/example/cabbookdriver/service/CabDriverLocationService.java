package com.example.cabbookdriver.service;

import com.example.cabbookdriver.constants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class CabDriverLocationService {

    @Autowired private KafkaTemplate<String,Object> kafkaTemplate;

    public CompletableFuture<SendResult<String, Object>> updateLocation(String location)
    {
        return kafkaTemplate.send(AppConstants.CABLOCATION,location);
    }

}
