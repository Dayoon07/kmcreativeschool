package com.km.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.km.model.dto.Police;
import com.km.model.dto.PoliceStation;

public interface PoliceDao {
	Police selectPoliceById(SqlSession session,  String id);
	int insertPolice(SqlSession session,  Police police);
	List<Map> selectPoliceAll(SqlSession session);
	PoliceStation selectPoliceStationByName(SqlSession session, String name);
	int insertPoliceStation(SqlSession session, PoliceStation policeStation);
	List<Police> findIdPw(SqlSession session, String policeEmail);
	Police selectPoliceByEmail(SqlSession session, String email);
	int updatePolicePassword(SqlSession session, String email, String newPassword);
	int updatePoliceLog(SqlSession session,Map param);
	void deletePolice(SqlSession session, String policeIdentity);
	List<Map> selectDeclarationCount(SqlSession session, Map param);
	List<Map> selectReportSearch(SqlSession session, Map param);
	long selectReportByParamCount(SqlSession session, Map<String,Object> param);
}
