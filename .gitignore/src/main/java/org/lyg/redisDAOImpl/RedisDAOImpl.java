package org.lyg.redisDAOImpl;

import org.lyg.redisDAO.RedisDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

//import org.apache.camel.builder.RouteBuilder;

@Service
public class RedisDAOImpl implements RedisDAO {

	@Autowired
	private StringRedisTemplate redisTemplate;
	@Override
	public String getValueByKey(String key)
	{
		return redisTemplate.opsForValue().get(key);
	}
}