package com.dapao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/ent/*")
public class EntController {

	private static final Logger logger = LoggerFactory.getLogger(EntController.class);

	// http://localhost:8088/ent/entMain
	@RequestMapping(value = "/entMain", method = RequestMethod.GET)
	public void entMainGET() {
		logger.debug(" entMainGET() ");
		logger.debug(" ����� ��������(/views/ent/entMain.jsp)�� ��� ");
	}

	// http://localhost:8088/ent/productManage
	@RequestMapping(value = "/productManage", method = RequestMethod.GET)
	public void productManageGET() {
		logger.debug(" entMainGET() ");
		logger.debug(" ����� ��������(/views/ent/productManage.jsp)�� ��� ");
	}

	// http://localhost:8088/ent/order
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public void orderGET() {
		logger.debug(" orderGET() ");
		logger.debug(" ����� ��������(/views/board/order.jsp)�� ��� ");
	}
}
