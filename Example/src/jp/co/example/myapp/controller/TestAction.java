package jp.co.example.myapp.controller;

import java.util.List;

import org.slim3.controller.Navigation;

import jp.co.example.myapp.dto.TestDto;
import jp.co.example.myapp.logic.TestLogic;
import jp.co.example.myapp.model.Test;
import jp.co.yoshidumi.core.controller.AbstractAction;
import jp.co.yoshidumi.core.controller.ajax.Ajax;
import jp.co.yoshidumi.core.controller.ajax.Ajax.PropertyCase;
import jp.co.yoshidumi.core.util.StringUtils;

/**
 * Test用Action<br>
 * 
 * @author yasue
 *
 */
public class TestAction extends AbstractAction {

	private TestLogic testLogic;
	private String testCode;
	private List<TestDto> testList;

	/**
	 * /test?testCode=xxxxx
	 * 
	 * @return
	 */
	public String list() {
		List<Test> tests = testLogic.select();
		testList = testLogic.cvtModel2dto(tests);
		return LIST;
	}

	@Ajax(propertyCase = PropertyCase.LOWER_SNAKE)
	public TestDto load() {
		Test test = testLogic.selectById(testCode);
		return testLogic.cvtModel2dto(test);
	}

	public Navigation test() {
		if (StringUtils.isEmpty(testCode)) {
			return null;
		}
		return null;
	}

	public void setTestLogic(TestLogic testLogic) {
		this.testLogic = testLogic;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public List<TestDto> getTestList() {
		return testList;
	}

}
