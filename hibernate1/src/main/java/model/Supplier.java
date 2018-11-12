package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sId;
	@Size(min=2,max=10,message="Enter appropriate name")
	private String sName;
	private String sAddress;
	public Supplier(String sName, String sAddress) {
		this.sName = sName;
		this.sAddress = sAddress;
	}
	
	public Supplier()
	{
		
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	
}
