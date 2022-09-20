package com.example.serviceconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>(TestController)</b>
 *
 * @author Rainy
 * @version 1.0.0
 * @date 2022/9/19
 */
@RestController
@RefreshScope
@RequestMapping(value = "/test")
public class TestController {

    @Value("${test.code:default_name}")
    private String key;

    @GetMapping(value = "/getConfigValue")
    public String returnTest() {
        return key;
    }

}
