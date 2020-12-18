package com.aliyun.openservices.spring.example.normal;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.ONSFactory;
import com.aliyun.openservices.ons.api.PropertyKeyConst;
import com.aliyun.openservices.ons.api.order.ConsumeOrderContext;
import com.aliyun.openservices.ons.api.order.MessageOrderListener;
import com.aliyun.openservices.ons.api.order.OrderAction;
import com.aliyun.openservices.ons.api.order.OrderConsumer;

import java.util.Properties;

/**
 * 订阅消息顺序
 */
public class ConsumerClient_test {

    public static void main(String[] args) {
        Properties properties = new Properties();
// 您在控制台创建的 Group ID
        properties.put(PropertyKeyConst.GROUP_ID, "CID_XINDIAN_ZT_MATTER");
// AccessKey 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.AccessKey, "z760kkGR0MTXsJ76");
// SecretKey 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.SecretKey, "YyVNR6wp0YGOd36RwUabeqtUoOOKK2");
// 设置 TCP 接入域名，进入控制台的实例管理页面的“获取接入点信息”区域查看
        properties.put(PropertyKeyConst.NAMESRV_ADDR,
                "10.16.11.37:9876");
// 顺序消息消费失败进行重试前的等待时间，单位(毫秒)，取值范围: 10 毫秒 ~ 1800 毫秒
        properties.put(PropertyKeyConst.SuspendTimeMillis, "1000");
// 消息消费失败时的最大重试次数
        properties.put(PropertyKeyConst.MaxReconsumeTimes, "20");

// 在订阅消息前，必须调用 start 方法来启动 Consumer，只需调用一次即可。
        OrderConsumer consumer = ONSFactory.createOrderedConsumer(properties);
        consumer.subscribe(
// Message 所属的 Topic
                "DEVZT_ZT_AUTHORITY_DATASEND_TOPIC",
// 订阅指定 Topic 下的 Tags：
// 1. * 表示订阅所有消息
// 2. TagA || TagB || TagC 表示订阅 TagA 或 TagB 或 TagC 的消息
                "modify_organisationId_1",
                new MessageOrderListener() {
                    /**
                     * 1. 消息消费处理失败或者处理出现异常，返回 OrderAction.Suspend<br>
                     * 2. 消息处理成功，返回 OrderAction.Success
                     */
                    @Override
                    public OrderAction consume(Message message, ConsumeOrderContext context) {
                        System.out.println(new String(message.getBody())+"-"+message.getMsgID());
                        return OrderAction.Success;
                    }
                });

        consumer.start();
    }
}
