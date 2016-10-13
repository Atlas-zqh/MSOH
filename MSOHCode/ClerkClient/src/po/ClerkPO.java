package po;

import java.awt.Image;
import java.io.Serializable;

public class ClerkPO implements Serializable {
	// ����������
	private String name;
	// �ֻ���
	private String phone;
	// ����
	private String password;
	// ���֤��
	private String ID;
	// ���ھƵ�����
	private String hotelName;
	// ���ھƵ�ID
	private String hotelID;
	// ְλ
	private String position;
	// ����ͷ��
	private Image pic;

	public ClerkPO() {
	}

	public ClerkPO(String name, String phone, String password, String ID, String hotelName, String hotelID,
			String position, Image pic) {
		this.name = name;
		this.phone = phone;
		this.password = password;
		this.ID = ID;
		this.hotelName = hotelName;
		this.hotelID = hotelID;
		this.position = position;
		this.pic=pic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getID() {
		return ID;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Image getPic(){
		return pic;
	}
	
	public void setPic(Image pic){
		this.pic=pic;
	}
}
