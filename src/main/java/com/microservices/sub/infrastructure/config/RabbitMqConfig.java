package com.microservices.sub.infrastructure.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean public Queue queue()
    {
        return new Queue("queueName", false);
    }

    @Bean public Exchange exchange()
    {
        return new DirectExchange("exchangeName");
    }

    @Bean
    public Binding binding(Queue queue, Exchange exchange)
    {
        return BindingBuilder.bind(queue)
                .to(exchange)
                .with("routingKey")
                .noargs();
    }
}
