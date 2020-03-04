package com.king.server.sys.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @date: 2020/3/1 22:18
 * @author: duanyong
 * @desc:
 */
@RestController
public class ClientTestController {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://SERVER1";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/client1/{name}")
    public String say(@PathVariable(value = "name") String name){
        return restTemplate.getForObject(REST_URL_PREFIX+"/server1/yong and "+name, String.class);
    }

    @RequestMapping("/client11/{name}")
    public String say1(@PathVariable(value = "name") String name){
        return "welcome " + name;
    }
}
