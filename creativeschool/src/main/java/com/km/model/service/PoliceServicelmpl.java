package com.km.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.km.model.dao.PoliceDao;
import com.km.model.dto.Police;

@Service
public class PoliceServicelmpl implements PoliceService{
	
	@Autowired
	private PoliceDao dao;
	
	@Autowired
	private SqlSession session;
	
	@Override
	public Police selectPoliceById(String id) {
		return dao.selectPoliceById(session, id);
	}

	@Override
	public int insertPolice(Police police) {
		dao.insertPolice(session, police);
		return 1;
	}

	@Override
	public List<Map> selectPoliceAll() {
		return dao.selectPoliceAll(session);
	}
	
	
}
