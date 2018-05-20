/*package com.programinjava.learn.repository;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.programinjava.learn.model.User;

@Repository
public class UserRespositoryImpl implements UserRespository{
	
	static final String USER_KEY="USER";
	
	
	RedisTemplate<String,User> redisTemplate;
	
	
	HashOperations hashOperations;
	
	public UserRespositoryImpl(RedisTemplate<String,User> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOperations =redisTemplate.opsForHash();
	}
	
	

	@Override
	public void save(User user) {
		hashOperations.put(USER_KEY, user.getMobilNumber(), user);
	}

	@Override
	public Map<String,User> findAll() {
		// TODO Auto-generated method stub
		return hashOperations.entries(USER_KEY);
	}

	@Override
	public User findById(Integer mobilenumber) {
		// TODO Auto-generated method stub
		return (User) hashOperations.get(USER_KEY, mobilenumber);
	}
	
}
*/