/**
 * Copyright (C) 2010-2016 Alibaba Group Holding Limited
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyun.openservices.tcp.example;

/**
 * MQ 配置
 */
public class MqConfig {
    /**
     * 启动测试之前请替换如下 XXX 为您的配置
     */
    //测试环境
   public static final String TOPIC = "DEVZT_ZT_AUTHORITY_DATASEND_TOPIC";
     public static final String Consumer_Id = "CID_ACCEPT_ORG_USER";
    public static final String Producer_Id = "PID_DEVZT_ZT_AUTHORITY_DATASEND";
    public static final String ORDER_TOPIC = "DEVZT_ZT_AUTHORITY_DATASEND_TOPIC";
    public static final String ORDER_GROUP_ID = "AliyunMQ";
    public static final String ACCESS_KEY = "z760kkGR0MTXsJ76";
    public static final String SECRET_KEY = "YyVNR6wp0YGOd36RwUabeqtUoOOKK2";
    public static final String TAG = "*";
//生产环境
 /*   public static final String TOPIC = "CITY_PROD_AUTHORITY_DATASEND_TOPIC";
    public static final String Consumer_Id = "CID_CITY_PROD_AUTHORITY_DATASEND";
    public static final String Producer_Id = "PID_CITY_PROD_AUTHORITY_DATASEND";
    public static final String ORDER_TOPIC = "CITY_PROD_AUTHORITY_DATASEND_TOPIC";
    public static final String ORDER_GROUP_ID = "AliyunMQ";
    public static final String ACCESS_KEY = "Sm0h9kgdDMaoTJy0";
    public static final String SECRET_KEY = "SfbojalUpxUZfM3G8tn2V04BOgxO6I";
    public static final String TAG = "*";*/


    /**
     * NAMESRV_ADDR, 请在mq控制台 https://ons.console.aliyun.com 通过"实例管理--获取接入点信息--TCP协议接入点"获取
     */
    public static final String NAMESRV_ADDR = "10.16.11.37:9876";

}
