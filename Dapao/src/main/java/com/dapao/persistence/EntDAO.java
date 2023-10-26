package com.dapao.persistence;

import com.dapao.domain.EntVO;

public interface EntDAO {
	//사업자조회
	public EntVO getEnt(String own_id);
}
