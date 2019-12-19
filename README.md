# springcloud demo
# JDK Version 1.8
# MySQL Version 5.7
# Maven 3.5
# 本项目主要使用到eureka,Feign,是一个基础的SpringCloud项目
# 本次使用的版本是Greenwich.SR2,目前最新版本是Hoxton
# eureka服务中心和provider服务提供者有三个模块，并无差别，只是为了模拟多个服务并行的情况
需要先将microservicecloud-api打包成jar文件以供各模块调用即可
其次我在项目中映射了eureka服务中心的域名，只需根据eureka模块的配置文件在hosts文件中映射域名即可