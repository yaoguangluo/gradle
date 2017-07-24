package org.lyg.iluwatar.handler;

import org.hibernate.Query;
import org.hibernate.Session;
import org.lyg.common.HibernateUtil;
import org.lyg.entity.Lolroler;
import org.lyg.iluwatar.Handler;
import org.lyg.iluwatar.event.UserCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handles the {@link UserCreatedEvent} message.
 */
public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {
  private static final Logger LOGGER = LoggerFactory.getLogger(UserCreatedEventHandler.class);
  @Override
  public void onEvent(UserCreatedEvent event) {
	     Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
 	     Map<String, Object> result=new HashMap<String, Object>();
	 	 String hql = "FROM Lolroler as l where l.name= :userName";
	 	 Query query = session.createQuery(hql);
	 	 query.setString("userName", "Vi");
	 	 List<Lolroler> results = query.list(); 
	 	 session.getTransaction().commit();
	 	 result.put("end", results);
         LOGGER.info("User '{}' has been Created!", results.get(0).getId());
  }
}