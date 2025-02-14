package com.microservices.sub.infrastructure.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitConsumer {

    @RabbitListener(queues = "queue-name")
    public void receiveMessages(String message){
        System.out.println("Teste, mensagem recebida: " + message);

    }
}
