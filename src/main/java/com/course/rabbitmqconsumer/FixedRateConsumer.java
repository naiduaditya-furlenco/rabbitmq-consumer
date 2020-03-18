package com.course.rabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class FixedRateConsumer {

    @RabbitListener(queues = "couse.fixedrate")
    public void listen(String message){
        System.out.println("Consuming: " + message);
    }
}
