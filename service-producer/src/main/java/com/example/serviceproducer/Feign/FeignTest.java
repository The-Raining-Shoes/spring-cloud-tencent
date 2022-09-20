package com.example.serviceproducer.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <b>(FeignTest)</b>
 *
 * @author Rainy
 * @version 1.0.0
 * @date 2022/9/20
 */
@FeignClient(name = "service-producer")
public interface FeignTest {

    /**
     * 测试
     *
     * @param value 入参
     * @return string
     */
    @GetMapping("/echo/{value}")
    String echo(@PathVariable("value") String value);

}
