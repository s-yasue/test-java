package jp.co.example.myapp.dao;

import java.util.Date;
import java.util.List;

import jp.co.example.myapp.dao.impl.base.TestDaoImplBase;
import jp.co.example.myapp.model.Test;
import jp.co.yoshidumi.core.datastore.DatastoreAccessor;

@DatastoreAccessor(Test.class)
public class TestDao extends TestDaoImplBase {

	public List<Test> selectByRegisterDate() {
		return select(META.registerDate.greaterThan(new Date())).asList();
	}
	
	
}
