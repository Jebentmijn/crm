package com.bjpowernode;

import redis.clients.jedis.Jedis;

public class App
{
    public static void main( String[] args ){
        Jedis jedis = new Jedis("192.168.73.130",6384);
        jedis.flushDB();
        jedis.set("name", "tom");
        String name = jedis.get("name");
        System.out.println(name);
    }
}
