package com.example.nacosprovider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：LiuJianhua
 * @date ：Created in 2020/9/29 19:13
 * @description :
 */
@RestController
@RequestMapping("/provide/")
@Slf4j
public class ProviderController {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        log.info("I'm calling nacos-provider service by dynamic gateway...");
        return name + " Hi~, I'm from nacos-provider";
    }
}
