package com.course.rabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloRabbitConsumer {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "couse.hello")
    public void  receiveMessage(String message){
        System.out.println("Consuming " + message);
    }
}
