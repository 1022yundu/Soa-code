package com.itheima.streamrabbitmqconsumer.client;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;


@Service
public class BindingConsumer {
    /**
     * 方法名为myChannel，须与通道名称一致,myChannel-in-0通道名为myChannel
     */
    @Bean
    public Consumer<String> myChannel() {
        return System.out::println;
    }
}