package com.springcloud.controllers;

import com.springcloud.model.Coupon;
import com.springcloud.repos.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
    CouponRepo repo;

	/**
	 * Create a coupon
	 * @param coupon
	 * @return
	 */
	@RequestMapping(value = "/coupons", method = RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {

		return repo.save(coupon);

	}

	/**
	 * GEt coupon for product.
	 * @param code
	 * @return
	 */
	@RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code) {
		System.out.println("Server 2");
		return repo.findByCode(code);

	}
}
