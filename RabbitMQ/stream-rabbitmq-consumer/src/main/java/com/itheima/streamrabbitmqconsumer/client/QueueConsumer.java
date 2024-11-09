//package com.itheima.streamrabbitmqconsumer.client;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class QueueConsumer {
//
//    @RabbitListener(queues = "simple.queue")
//    public void receive(String message) {
//        System.out.println("接收到MQ消息:" + message);
//    }
//}
