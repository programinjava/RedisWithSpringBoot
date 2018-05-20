package com.programinjava.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.programinjava.learn.model.User;

@Configuration
public class RedisConfigurations {
	
	
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisConFactory
	      = new JedisConnectionFactory();
	    jedisConFactory.setHostName("localhost");
	    jedisConFactory.setPort(6379);
	    return jedisConFactory;
	}
	
	@Bean
	public RedisTemplate<String, User> redisTemplate(){
		RedisTemplate<String,User> redisTempate = new RedisTemplate<>();
		redisTempate.setConnectionFactory(jedisConnectionFactory());
		return redisTempate;
	}
	

}
