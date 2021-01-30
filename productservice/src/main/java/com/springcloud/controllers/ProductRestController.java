package com.springcloud.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.model.Product;
import com.springcloud.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.model.Coupon;
import com.springcloud.restclients.CouponClient;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/productapi")
@RefreshScope
public class ProductRestController {

	@Autowired
	CouponClient couponClient;

	@Autowired
	private ProductRepo repo;

	@Value("${com.test.springcloud.prop}")
	private String prop;

	@HystrixCommand(fallbackMethod = "sendErrorResponse")
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public Product create(@RequestBody Product product) {
		Coupon coupon = couponClient.getCoupon(product.getCouponCode());
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return repo.save(product);
	}

	/**
	 * Fault tolerant method when something foes wrong inside create method and it will be invoked
	 * by Hysterix and respnse sent back to the client,
	 * @param product
	 * @return
	 */
	public Product sendErrorResponse(Product product) {
		return product;

	}

	@RequestMapping(value="/prop",method = RequestMethod.GET)
	public String getProp(){
		return this.prop;
	}

}
