### 基于spring cloud的趋势投资项目

##### 存第三方数据到redis的顺序
* 启动EurekaServerApplication
* 启动ThirdPartIndexDataApplication
* 启动 IndexGatherStoreApplication

存到了redis中后可以关闭``ThirdPartIndexDataApplication``
和``IndexGatherStoreApplication``  
以后访问数据会直接访问redis

##### 项目启动顺序
* 启动 EurekaServerApplication
* 启动 redis
* 启动 IndexConfigServerApplication
* 启动 IndexCodesApplication
* 启动 IndexDataApplication
* 启动 TrendTradingBackTestServiceApplication
* 启动 TrendTradingBackTestViewApplication
* 启动 IndexZuulServiceApplication
* 访问http://127.0.0.1:8031/api-view/

##### 微服务端口

微服务 | 项目名 |  端口  
-|-|-
注册中心|eureka-server | 8761 
第三方数据中心|third-part-index-data-project | 8090 
数据采集|index-gather-store-service | 8001 
股票代号服务|index-codes-service | 8011,8012,8013 
数据服务|index-data-service | 8021,8022,8023 
路由|index-zuul-service | 8031 
模拟回测服务|trend-trading-backtest-view | 8041,8042,8043 
模拟回测视图服务|trend-trading-backtest-service | 8051,8052,8053 
配置服务|index-config-server | 8060 
断路器监控|index-hystrix-dashboard | 8070 
断路器聚合监控|index-turbine | 8080 

##### 第三方工具端口

工具 |  端口  
-|-
redis | 6379 
zipkin | 9411
rabbitmq | 5672

##### 项目图片
![微信截图_20191109183212.png](https://i.loli.net/2019/11/09/xJi8fqaWRXlcv9u.png)

![微信截图_20191109183253.png](https://i.loli.net/2019/11/09/E1wSUz6dL4IluVs.png)

![微信截图_20191109183243.png](https://i.loli.net/2019/11/09/7tCIKqunAQjLxfG.png)

![微信截图_20191109183306.png](https://i.loli.net/2019/11/09/gmr4CRve5WwhHDQ.png)

![微信截图_20191109183232.png](https://i.loli.net/2019/11/09/THCUszRpmkb9Jvo.png)

![微信截图_20191109183313.png](https://i.loli.net/2019/11/09/TxzqU6t8ldWFAus.png)