# Microservices with springcloud

#### Steps for containerization of service.        
        
        1.Run docker

        2.Create Dockerfile for project under root directory.

        3.Login to docker using ```docker login ``` command

        4.Docker delete images from powershell

         ```$images = docker images -a -q
            foreach ($image in $images) { docker image rm $image -f }```

        ```docker build -t eurekaserver .```
         ```docker build -t <dockerusername>/eurekaserver .```
        
        5```docker images```
        
           
           REPOSITORY          TAG                 IMAGE ID            
           eurekaserver        latest              2d24fe081fff      
           openjdk             8-jdk-alpine        a3562aa0b991        
                                
               
        6.  ```docker run  -p 8761 eurekaserver``` --will run on default container port
        
            ```docker run  -p 8080:8761 eurekaserver``` --will run on localhost:8080
                
           ```docker run  -p 8761:8761 eurekaserver``` --will run on localhost:8080      
           
        7.Check running containers.
        ```docker ps```
        
        7.Stop all running containers.
        ```docker rm -f $(docker ps -a -q)```
                        
       5.Run docker push command with the tag name being like username/repository name
       
       ```docker push <dockerusername>/eurekaserver```


## Steps for deploying the docker image to an ECS cluster.

   ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image1.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image2.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image3.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image4.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image5.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image6.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image7.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image8.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image9.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image10.png)
  
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image11.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image12.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image13.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image14.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image15.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image16.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image17.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image18.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image19.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image20.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image21.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image22.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image23.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image24.png)
  
  ![Alt desc](https://github.com/nj11/springcloud/blob/master/screenshots/image25.png)
