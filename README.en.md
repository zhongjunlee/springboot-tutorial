<p align="center">
  <span>English | <a href="./README.md">中文</a></span>
</p>

## Introduction
This is an introductory tutorial on integrating common development techniques through Spring Boot. Through this tutorial, you can quickly develop the functionality of your own project.

## Skills
Spring Boot version `2.1.0.RELEASE`
## Environment

- **JDK 1.8 +**
- **Maven 3.5 +**
- **IntelliJ IDEA ULTIMATE 2018.2 +** (*Note: Please use IDEA and make sure plugin `lombok` installed.*)
- **Mysql 5.7 +** (*Please use version 5.7 or higher because mysql has some new features and is not backward compatible at version 5.7. Althought this project will try to avoid this incompatibility*)

## Getting Started


1. `git clone https://github.com/johnny/spring-boot-demo.git`
2. Open the cloned project in IDEA
3. Import the `pom.xml` file from the root directory using `Maven Projects` panel

### Module Introduction

| Module Name                                                  | Module Description                                           |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [demo-helloworld](./demo-helloworld)                         | a helloworld demo.                                           |
| [demo-properties](./demo-properties)                         | a demo to read the contents of configuration file.           |
| [demo-actuator](./demo-actuator)                             | a demo to integrate spring-boot-starter-actuator for monitoring the starting status and the running status of application. |
| [demo-admin-client](./demo-admin/admin-client)               | a client demo to  integrate spring-boot-admin for visually monitoring the running status of application, it can be used with spring-boot-starter-actuator. |
| [demo-admin-server](./demo-admin/admin-server)               | a server demo to  integrate spring-boot-admin for visually monitoring the running status of the spring-boot program, it can be used with spring-boot-starter-actuator. |
| [demo-logback](./demo-logback)                               | a demo to integrate the logback for logging.                 |
| [demo-log-aop](./demo-log-aop)                               | a demo to record web request logs using AOP aspect.          |
| [demo-exception-handler](./demo-exception-handler)           | a demo to demonstrate global exception handling, including 2 types, the first one returns  json data, and the second one jumps to error page. |
| [demo-template-freemarker](./demo-template-freemarker)       | a demo to integrate Freemarker template engine.              |
| [demo-template-thymeleaf](./demo-template-thymeleaf)         | a demo to integrate Thymeleaf template engine.               |
| [demo-template-beetl](./demo-template-beetl)                 | a demo to integrate Beetl template engine.                   |
| [demo-template-enjoy](./demo-template-enjoy)                 | a demo to integrate Enjoy template engine.                   |
| [demo-orm-jdbctemplate](./demo-orm-jdbctemplate)             | a demo to integrate the Jdbc Template for operating database and easily encapsulate the generic Dao layer. |
| [demo-orm-jpa](./demo-orm-jpa)                               | a demo to integrate spring-boot-starter-data-jpa for operating database. |
| [demo-orm-mybatis](./demo-orm-mybatis)                       | a demo to integrate native mybatis by using [mybatis-spring-boot-starter](https://github.com/mybatis/spring-boot-starter) dependency. |
| [demo-orm-mybatis-mapper-page](./demo-orm-mybatis-mapper-page) | a demo to integrate [Mapper](https://github.com/abel533/Mapper) and [PageHelper](https://github.com/pagehelper/Mybatis-PageHelper) by using [mapper-spring-boot-starter](https://github.com/abel533/Mapper/tree/master/spring-boot-starter) and [pagehelper-spring-boot-starter](https://github.com/pagehelper/pagehelper-spring-boot) dependencies. |
| [demo-orm-mybatis-plus](./demo-orm-mybatis-plus)             | a demo to integrate [mybatis-plus](https://mybatis.plus/en/) by using [mybatis-plus-boot-starter](http://mp.baomidou.com/) dependency, integrate BaseMapper / BaseService / ActiveRecord to operate database. |
| [demo-orm-beetlsql](./demo-orm-beetlsql)                     | a demo to integrate [beetl-sql](http://ibeetl.com/guide/#beetlsql) by using [beetl-framework-starter](http://ibeetl.com/guide/#beetlsql) dependency. |
| [demo-upload](./demo-upload)                                 | a file upload demo, including local file upload and qiniu cloud file upload. |
| [demo-cache-redis](./demo-cache-redis)                       | a demo to integrate redis, operate data in redis, and use redis to cache data. |
| [demo-cache-ehcache](./demo-cache-ehcache)                   | a demo to integrate ehcache, and use ehcache to cache data.  |
| [demo-email](./demo-email)                                   | a demo to integrate email, including sending simple text email, HTML email (including template HTML email), attachment email, and static resource email. |
| [demo-task](./demo-task)                                     | a demo to show easy to use scheduled task.                   |
| [demo-task-quartz](./demo-task-quartz)                       | a demo to integrate quartz for managing scheduled tasks, including adding new scheduled tasks, deleting scheduled tasks, suspending scheduled tasks, restoring scheduled tasks, modifying scheduled task startup times, and timing task list queries, and `providing front-end pages`. |
| [demo-task-xxl-job](./demo-task-xxl-job)                     | a demo to integrate [xxl-job](http://www.xuxueli.com/xxl-job/en/#/) for distributed scheduled tasks and provide methods to manage scheduled tasks bypass `xxl-job-admin`, including scheduled task lists, trigger lists, new scheduled tasks, deleted scheduled tasks, stopped scheduled tasks, and started scheduled tasks. Modify the scheduled task and manually trigger the scheduled task. |
| [demo-swagger](./demo-swagger)                               | a demo to integrate native `swagger` to manage and test API interfaces. |
| [demo-swagger-beauty](./demo-swagger-beauty)                 | a demo to integrate third part of swagger dependency [swagger-bootstrap-ui](https://github.com/xiaoymin/Swagger-Bootstrap-UI) to beautify document style and manage and test API interfaces. |
| [demo-rbac-security](./demo-rbac-security)                   | a demo to integrate spring security implement privilege management based on RBAC privilege model, supports custom filtering request, dynamic privilege authentication, uses JWT security authentication, supports online population statistics, manually kicks out users, etc. |
| [demo-rbac-shiro](./demo-rbac-shiro)                         | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to integrate shiro for authentication management. |
| [demo-session](./demo-session)                               | a demo to integrate Spring Session to implement Session sharing, restart program Session does not expire. |
| [demo-oauth](./demo-oauth)                                   | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to implement the oauth server and  to implement oauth2 protocol such as the authorization code, access token. |
| [demo-social](./demo-social)                                 | a demo to integrate third-party login by using `justauth-spring-boot-starter` dependency to achieve QQ login, GitHub login, WeChat login, Google login, Microsoft login, Xiaomi login, enterprise WeChat login. |
| [demo-zookeeper](./demo-zookeeper)                           | a demo to integrate Zookeeper and AOP to implement distributed lock. |
| [demo-mq-rabbitmq](./demo-mq-rabbitmq)                       | a demo to integrate RabbitMQ implementation for message delivery and reception based on direct queue mode, fanout mode, topic mode, delay queue. |
| [demo-mq-rocketmq](./demo-mq-rocketmq)                       | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to integrate RocketMQ implementation for message delivery and reception. |
| [demo-mq-kafka](./demo-mq-kafka)                             | a demo to integrate Kafka implementation for message delivery and reception. |
| [demo-websocket](./demo-websocket)                           | a demo to integrate websocket, the backend actively pushes the server running status to front end. |
| [demo-websocket-socketio](./demo-websocket-socketio)         | a demo to integrate websocket by using `netty-socketio`, implement a simple chat room. |
| [demo-ureport2](./demo-ureport2)                             | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to integrate [ureport2](https://github.com/youseries/ureport) to implement complex, customized Chinese-style reports. |
| [demo-uflo](./demo-uflo)                                     | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to integrate [uflo](https://github.com/youseries/uflo)(process engine like Activiti and Flowable) to quickly implement a lightweight process engine. |
| [demo-urule](./demo-urule)                                   | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to integrate [urule](https://github.com/youseries/urule)(rule engine like drools) fast implementation rule engine. |
| [demo-activiti](./demo-activiti)                             | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to integrate Activiti 7 process engine. |
| [demo-async](./demo-async)                                   | asynchronous execution of tasks by using natively provided asynchronous task support. |
| [demo-war](./demo-war)                                       | packaged into a war format configuration                     |
| [demo-elasticsearch](./demo-elasticsearch)                   | a demo to integrate ElasticSearch by using `spring-boot-starter-data-elasticsearch` to implement advanced techniques for using ElasticSearch, including creating indexes, configuring mappings, deleting indexes, adding and deleting basic operations, complex queries, advanced queries, aggregate queries, etc. |
| [demo-dubbo](./demo-dubbo)                                   | a demo to integrate Dubbo, common module `spring-boot-demo-dubbo-common`, service provider `spring-boot-demo-dubbo-provider`, service consumer `spring-boot-demo-dubbo-consumer`. |
| [demo-mongodb](./demo-mongodb)                               | a demo to integrate MongoDB and use the official starter to CRUD. |
| [demo-neo4j](./demo-neo4j)                                   | a demo to integrate Neo4j graph database to implement a campus character relationship network. |
| [demo-docker](./demo-docker)                                 | docker container.                                            |
| [demo-multi-datasource-jpa](./demo-multi-datasource-jpa)     | a demo to implement JPA multi-datasource.                    |
| [demo-multi-datasource-mybatis](./demo-multi-datasource-mybatis) | a demo to implement Mybatis multi-datasource by using an open source solution from Mybatis-Plus. |
| [demo-sharding-jdbc](./demo-sharding-jdbc)                   | a demo to use `sharding-jdbc` to implement sub-database and sub-tables, while ORM uses Mybatis-Plus. |
| [demo-tio](./demo-tio)                                       | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to integrate t-io(a network programming framework like netty). |
| demo-grpc                                                    | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to integrate Google grpc, need to be configure tls/ssl, see [ISSUE#5](https://github.com/johnny/spring-boot-demo/issues/5). |
| [demo-codegen](./demo-codegen)                               | a demo to integrate velocity template engine to implement code generator, improve development efficiency. |
| [demo-graylog](./demo-graylog)                               | a demo to integrate graylog for unified log collection.      |
| demo-sso                                                     | <span style="color:pink;">NOT FINISHED YET!</span> <br />a demo to integrate Single Sign On, see [ISSUE#12](https://github.com/johnny/spring-boot-demo/issues/12). |
| [demo-ldap](./demo-ldap)                                     | a demo to integrate LDAP to use `spring-boot-starter-data-ldap` to implement  CURD operations and give the login demo, see [ISSUE#23](https://github.com/johnny/spring-boot-demo/issues/23), thanks [@fxbin](https://github.com/fxbin). |
| [demo-dynamic-datasource](./demo-dynamic-datasource)         | a demo to add datasource dynamically, switch datasource dynamically. |
| [demo-ratelimit-guava](./demo-ratelimit-guava)               | a demo to use use Guava RateLimiter to protect API  by standalone rate limiting. |
| [demo-ratelimit-redis](./demo-ratelimit-redis)               | a demo to use Redis and Lua script implementation to protect API by distributed rate limiting. |
| [demo-https](./demo-https)                                   | a demo to integrate HTTPS.                                   |
| [demo-elasticsearch-rest-high-level-client](./demo-elasticsearch-rest-high-level-client) | a demo to integrate ElasticSearch 7.x version by using official Rest High Level Client to operate ES data. |
| [demo-flyway](./demo-flyway)                                 | a demo to integrate Flyway to initialize tables and data in database, Flyway also support the sql script version control. |
| [demo-ureport2](./demo-ureport2)                             | a demo to integrate Ureport2 to design the Chinese complex report file. |
