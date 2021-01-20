package com.springcloud;

import com.springcloud.filters.RequestTracingFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulProxyApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyApplication.class, args);
	}

	/**
	 * RequestTracingFilter for
	 * logging API requests.
	 * @return
	 */
	@Bean
	public RequestTracingFilter getFilter(){
		return new RequestTracingFilter();
	}

}
