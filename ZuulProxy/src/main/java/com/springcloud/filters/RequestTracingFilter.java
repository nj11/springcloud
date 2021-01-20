package com.springcloud.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class RequestTracingFilter extends ZuulFilter {

    //Logger
    private static Logger logger = LoggerFactory.getLogger(RequestTracingFilter.class);

    /**
     * Pre / Post / Error / Route
     * @return
     */
    @Override
    public String filterType() {
        //Execute before the request is sent to the microservice.
        return "pre";
    }

    /**
     * Filter ORder if multiple filters are defined.
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * Always return true if you want
     * filtering to occur.
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * Filter logic goes here.
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        //log HTTP method as well as the URL.
        logger.info(String.format("%s request to %s", request.getMethod(),request.getRequestURL()));
        return null;
    }

}
