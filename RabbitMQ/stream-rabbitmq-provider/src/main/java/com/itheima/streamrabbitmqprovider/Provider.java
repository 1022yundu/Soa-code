package com.itheima.streamrabbitmqprovider;

import jakarta.annotation.Resource;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Provider {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Resource
    private StreamBridge streamBridge;

    @RequestMapping("/send1")
    public String publish1(String message) {
        String queueName = "simple.queue";
        rabbitTemplate.convertAndSend(queueName, message);
        return "消息发送成功！" + new Date();
    }

    @RequestMapping("/send")
    public String publish() {
        String message="woshi nidei!!";
        Message<?> payload = MessageBuilder.withPayload(message).setHeader("par",0).build();
        System.out.println(payload);

        String bindingName = "myChannel-out-0";
        streamBridge.send(bindingName, payload);
        return "消息发送成功！" + new Date();
    }

    @GetMapping("/hello")
    public String Mywor(){
        String name="陈桥东";
        String sid="2022055673065";
        String queueName = "minestream";

        String message=name+";"+sid+";"+new Date();

//        Message<?> payload = MessageBuilder.withPayload(message).setHeader("par",0).build();
        Message<?> payload = MessageBuilder.withPayload(message).build();
        System.out.println(payload);

        String bindingName = "myChannel-out-0";
        streamBridge.send(bindingName, payload);
        return "消息发送成功！" + new Date();
    }
}
