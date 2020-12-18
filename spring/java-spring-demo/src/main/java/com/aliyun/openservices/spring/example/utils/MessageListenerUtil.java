package com.aliyun.openservices.spring.example.utils;

import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author YZ
 */
public class MessageListenerUtil implements MessageListener {

     Logger logger = LoggerFactory.getLogger(MessageListenerUtil.class);

    @Override
    public Action consume(Message message, ConsumeContext context) {
        System.out.println("Receive: " + message.getMsgID());
        try {
            String tag = message.getTag();
            System.out.println("消息来了tag:" + tag);
            System.out.println("消息来了"+new String(message.getBody()));

            return Action.CommitMessage;
        } catch (Exception e) {
            // 消费失败
            return Action.ReconsumeLater;
        }
    }

}
