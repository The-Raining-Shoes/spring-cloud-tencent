package com.example.serviceproducer.controller;

import com.tencent.cloud.polaris.PolarisDiscoveryProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>(PrintController)</b>
 *
 * @author Rainy
 * @version 1.0.0
 * @date 2022/9/20
 */
@RestController
public class PrintController {

    @Autowired
    private PolarisDiscoveryProperties properties;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello PolarisMesh " + string + ", I'm " + properties.getService();
    }

}
