package com.example.serviceproducer.controller;

import com.example.serviceproducer.Feign.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>(FeignTestController)</b>
 *
 * @author Rainy
 * @version 1.0.0
 * @date 2022/9/20
 */
@RestController
@RequestMapping(value = "/feign")
public class FeignTestController {

    @Autowired
    private FeignTest client;

    @GetMapping(value = "/echo")
    public String echo(@RequestParam(name = "value") String val) {
        return client.echo(val);
    }

}
