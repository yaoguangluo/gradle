package org.lyg.restServiceImpl;

import org.lyg.hbntDAO.SelectDAO;
import org.lyg.restService.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
	@Autowired
	private SelectDAO selectDAO;
	@Override
	public void testSample(int id) {
		// TODO Auto-generated method stub
		selectDAO.selectTableById(id);
	}
}