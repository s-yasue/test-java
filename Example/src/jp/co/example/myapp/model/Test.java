package jp.co.example.myapp.model;

import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModificationDate;

import jp.co.yoshidumi.core.datastore.BaseModel;
import jp.co.yoshidumi.core.datastore.DeleteFlag;
import jp.co.yoshidumi.core.datastore.Primarykey;

@Model
public class Test extends BaseModel {

	private static final long serialVersionUID = -305599619654585039L;

	@Primarykey
	private String testCode;	
	
	@Attribute(listener = CreationDate.class)
	private Date registerDate;

	@Attribute(listener = ModificationDate.class)
	private Date updateDate;

	@DeleteFlag
	private Boolean deleteFlag = Boolean.FALSE;

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
}
