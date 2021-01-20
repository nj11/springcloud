# Microservices with springcloud

### This project demonstrates microservices architectural pattern using the spring boot and spring cloud.

#### Spring cloud compnents:

* Eureka Server - Open source service discovery server.

![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/nameserver.png)


* Microservices
  * Product Service
  * Coupon Service
  
* Zuul API gateway
    * Helps put all the crossing cutting concerns in one single place like security,tracing and service aggregation and rate limits.
   
    * Zuul is just another microservice and it will register itself with Eureka.
   
    * API gateway as a single point of entry for all front end clients.
    
    * Zuul automatically gives us server side load balancing using Ribbon internally.
    
    * When invoking microservices from front end clients like Angular, invoke using this format 
      ```https://<servername>:8765/microservice-name/uri```  where 8765 is port for Zuul gateway server and microservice name is the name of the microservice registered under 
      the Eureka naming server.

![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/zuul.png)

![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/zuulfilters.png)

* Feign
   
   * Develop rest clients using Feign instead of RestTemplate.
   
   * Eg. Coupon service is invoked from Product Service using Feign.
   
   * Helps avoid hardcoding of URLs.







