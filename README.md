# Microservices with springcloud

### This project demonstrates microservices architectural pattern using the spring boot and spring cloud.

#### Spring cloud compnents:

* Eureka Server - Open source service discovery server.

* Microservices
  * Product Service
  * Coupon Service
  
* Zuul API gateway
    * Helps put all the crossing cutting concerns in one single place like security,tracing and service aggregation and rate limits.
   
    * Zuul is just another microservice and it will register itself with Eureka.
   
    * API gateway as a single point of entry for all front end clients.
    
    * Zuul automatically gives us server side load balancing using Ribbon internally.


* Feign
   
   * Develop rest clients using Feign instead of RestTemplate.
   
   * Eg. Coupon service is invoked from Product Service using Feign.
   
   * Helps avoid hardcoding of URLs.







