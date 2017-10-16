package jp.co.example.myapp.logic;

import java.util.ArrayList;
import java.util.List;

import jp.co.example.myapp.dao.TestDao;
import jp.co.example.myapp.dto.TestDto;
import jp.co.example.myapp.model.Test;

public class TestLogic {

	private TestDao testDao;

	public List<Test> select() {
		return testDao.selectAll();
	}

	public Test selectById(String testCode) {
		return testDao.selectById(testCode);
	}

	public TestDto cvtModel2dto(Test test) {
		TestDto dto = new TestDto();
		dto.setTestCode(test.getTestCode());
		return dto;
	}

	public List<TestDto> cvtModel2dto(List<Test> tests) {
		List<TestDto> list = new ArrayList<>();
		for (Test test : tests) {
			TestDto dto = new TestDto();
			dto.setTestCode(test.getTestCode());
			list.add(dto);
		}
		return list;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

}
