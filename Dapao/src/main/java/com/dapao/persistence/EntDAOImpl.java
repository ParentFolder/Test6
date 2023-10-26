package com.dapao.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dapao.domain.EntVO;

public class EntDAOImpl implements EntDAO {
	

	private static final Logger logger = LoggerFactory.getLogger(EntDAOImpl.class);
	private static final String NAMESPACE = "com.itwillbs.mapper.EntMapper";
	@Inject
	private SqlSession sqlsession;
	@Override
	public EntVO getEnt(String own_id) {
		logger.debug(" DAO-> getEnt() 호출");
		
		return sqlsession.selectOne(NAMESPACE+"", own_id);
	}

}
