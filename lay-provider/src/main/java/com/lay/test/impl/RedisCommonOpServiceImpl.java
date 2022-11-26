package com.lay.test.impl;

import com.lay.test.service.RedisCommonOpService;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class RedisCommonOpServiceImpl implements RedisCommonOpService {

    private static final String HOST = "192.168.127.128";
    private static final int PORT = 6379;

//    public static void main(String[] args) {
//        Jedis jedis = new Jedis(HOST, PORT);
//        System.out.println(jedis.get("mine"));
//        jedis.close();
//    }
}
