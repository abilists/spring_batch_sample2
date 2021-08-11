package io.sample.batch.dao;

import java.sql.SQLException;
import java.util.List;

import io.sample.batch.bean.model.SampleModel;

public interface OracleDao {

	public List<SampleModel> sltSampleTableList() throws SQLException;

	public int dltSampleTable() throws SQLException;

}