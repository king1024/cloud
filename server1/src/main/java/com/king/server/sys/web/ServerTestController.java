package com.king.server.sys.web;

import org.springframework.web.bind.annotation.*;

/**
 * @date: 2020/3/1 22:18
 * @author: duanyong
 * @desc:
 */
@RestController
public class ServerTestController {
    @RequestMapping("/server1/{name}")
    public String say(@PathVariable(value = "name") String name){
        return "hello " + name;
    }
}
