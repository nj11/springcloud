package com.springcloud.restclients;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springcloud.model.Coupon;

@FeignClient("zuul-api-gateway")
//@FeignClient("COUPON-SERVICE")
//@RibbonClient("COUPON-SERVICE")
public interface CouponClient {
	@GetMapping("coupon-service/couponapi/coupons/{code}")
	Coupon getCoupon(@PathVariable("code") String code);
}
