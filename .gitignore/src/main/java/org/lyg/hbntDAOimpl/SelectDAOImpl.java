package org.lyg.hbntDAOimpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.lyg.common.HibernateUtil;
import org.lyg.entity.Lolroler;
import org.lyg.hbntDAO.SelectDAO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.apache.camel.builder.RouteBuilder;

@Service
public class SelectDAOImpl implements SelectDAO
{
	@Override
	public void selectTableById(int id)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Map<String, Object> result = new HashMap<String, Object>();
		String hql = "FROM Lolroler as l where l.name= :userName";
		Query query = session.createQuery(hql);
		query.setString("userName", "Vi");
		List<Lolroler> results = query.list();
		System.out.println(results.get(0).getId());
		System.out.println(results.get(0).getName());
	}
}