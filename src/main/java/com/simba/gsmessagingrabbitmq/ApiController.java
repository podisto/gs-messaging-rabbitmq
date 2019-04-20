package com.simba.gsmessagingrabbitmq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:ElHadjiOmar.DIONE@orange-sonatel.com">podisto</a>
 * @since 2019-04-20
 */
@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @GetMapping("/welcome")
    public String sayHello(){
        return "Welcome to www.SpringBootDev.com";
    }
}
