package com.javier.roulette.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.javier.roulette.domain.Roulette;
import com.javier.roulette.domain.User;

@Configuration
public class RedisConfiguration {
	@Bean
	JedisConnectionFactory jedisConnectionFactory()
	{
		return new JedisConnectionFactory();
	}
	@Bean
	RedisTemplate<String, Roulette> redisTemplateRoulette()
	{
		final RedisTemplate<String, Roulette> redisTemplateRoulette= new RedisTemplate<>();
		redisTemplateRoulette.setConnectionFactory(jedisConnectionFactory());
		return redisTemplateRoulette;
	}
	@Bean
	RedisTemplate<String, User> redisTemplateUser()
	{
		final RedisTemplate<String, User> redisTemplateUser= new RedisTemplate<>();
		redisTemplateUser.setConnectionFactory(jedisConnectionFactory());
		return redisTemplateUser;
	}
}
