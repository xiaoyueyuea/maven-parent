package com.lay.test.controller;

import com.lay.test.util.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis/ops")
public class RedisController {

    @RequestMapping("/test")
    public JsonResult test() {
        return JsonResult.ok();
    }
}
