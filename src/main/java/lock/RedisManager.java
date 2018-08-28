package lock;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisManager {

     private static JedisPool jedisPool;
     static {
         JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
         jedisPoolConfig.setMaxTotal(20);
         jedisPoolConfig.setMaxIdle(10);
         jedisPool = new JedisPool(jedisPoolConfig,"192.168.1.10",6379);
         //git修改注释
     }

}
