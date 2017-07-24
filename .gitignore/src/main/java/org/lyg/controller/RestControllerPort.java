package org.lyg.controller;

//import org.apache.camel.builder.RouteBuilder;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.lyg.delegateBean.HelloBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RestControllerPort{
	//@Autowired 
	//private RedisTemplate<String,String> redisTemplate;
	@Autowired
	private StringRedisTemplate redisTemplate;
	@Autowired
    @Qualifier("HelloBean")
	private HelloBean helloBean;
//	private static Logger logger = LogManager.getLogger(RestControllerPort.class.getName());
	    @GET
	    @GetMapping("/aa")
		@Produces("application/json;charset=utf-8")
		public Map<String, Object> startResults(@QueryParam("aa") int aa) throws IOException
	    {
			//return Response.status(Status.OK).entity(result).build();
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("end", aa);
			System.out.println("4444" + result.get("end"));
			String AA = helloBean.saySomething(aa);
            result.put("end", AA);
			return result;
			//return Response.status(Status.OK).entity(result).build();
	    	/*
	    	 Session session = HibernateUtil.getSessionFactory().openSession();
			 session.beginTransaction();
	    	 Map<String, Object> result=new HashMap<String, Object>();
		 	 
		 	 String hql = "FROM Lolroler as l where l.name= :userName";
		 	
		 	 Query query = session.createQuery(hql);
		 	 result.put("end", results);

		 	 query.setString("userName", "Vi");
		 	 List<Lolroler> results = query.list(); 
		 	 session.getTransaction().commit();
			 return Response.status(Status.OK).entity(result).build();
			 */
	    	/*
	    	if(null == redisTemplate.opsForValue().get("click")){		
				redisTemplate.opsForValue().set("click", "0" , 24000 , TimeUnit.HOURS);
			}else{
				String click = redisTemplate.opsForValue().get("click");
				long click_long = Long.parseLong(click);
				click_long += 1;
				redisTemplate.opsForValue().set("click", String.valueOf(click_long) , 24000 , TimeUnit.HOURS);
			}
			System.out.println(1111);
	    	EventDispatcher dispatcher = new EventDispatcher();
	        dispatcher.registerHandler(UserCreatedEvent.class, new UserCreatedEventHandler());
			System.out.println(2222);
	        User user = new User("iluwatar");
	        dispatcher.dispatch(new UserCreatedEvent(user));

			System.out.println(3333);
	    	 Map<String, Object> result=new HashMap<String, Object>();
	    	 result.put("end", user.getUsername());
	    	 System.out.println("4444"+result.get("end"));
	    	 return Response.status(Status.OK).entity(result).build();
	    	 */
		}
		public void configure() throws Exception {
			// TODO Auto-generated method stub
		}
}