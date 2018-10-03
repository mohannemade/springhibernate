package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Product {
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pId;
	@Column(name="ProductName")
	String pName;
	@Column(name="ProductCost")
	int pCost;
	
	public Product() {
		
	}
	
	public Product(String pName, int pCost) {
		this.pName = pName;
		this.pCost = pCost;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pName;
	}

	public void setPname(String pName) {
		this.pName = pName;
	}

	public int getPcost() {
		return pCost;
	}

	public void setPcost(int pCost) {
		this.pCost = pCost;
	}
	
}
