package po;

import java.awt.Image;
import java.io.Serializable;

public class MarketerPO implements Serializable {
	// ����
	private String name;
	// ���֤��
	private String ID;
	// �ֻ���
	private String phone;
	// ����
	private String password;
	// ����ͷ��
	private Image pic;

	public MarketerPO() {
	}

	public MarketerPO(String name, String ID, String phone, String password, Image pic) {
		this.name = name;
		this.ID = ID;
		this.phone = phone;
		this.password = password;
		this.pic = pic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Image getPic() {
		return pic;
	}

	public void setPic(Image pic) {
		this.pic = pic;
	}

}
