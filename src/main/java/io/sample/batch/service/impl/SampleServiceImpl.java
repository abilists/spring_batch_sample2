package io.sample.batch.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sample.batch.bean.model.SampleModel;
import io.sample.batch.dao.OracleDao;
import io.sample.batch.service.AbstractService;
import io.sample.batch.service.SampleService;

@Service
public class SampleServiceImpl extends AbstractService implements SampleService {

	final Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);

	@Autowired
	private SqlSession oracleDao;
	@Autowired
    private Configuration configuration;

	@Override
	public void sltSampleList() throws SQLException {

		List<SampleModel> sampleList = null; 
		sampleList = oracleDao.getMapper(OracleDao.class).sltSampleTableList();

	}

}