package com.rts.bean;

public class Carz {
	
	private String CarNo;
	private String Manufacture;
	private String Model;
	private int KmsRan;
	private int PriceExpected;
	private int NoOfOwners;
	
	public Carz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carz(String CarNo, String Manufacture, String Model, int KmsRan, int PriceExpected, int NoOfOwners) {
		super();
		this.CarNo = CarNo;
		this.Manufacture = Manufacture;
		this.Model = Model;
		this.KmsRan = KmsRan;
		this.PriceExpected = PriceExpected;
		this.NoOfOwners = NoOfOwners;
	}

	public String getCarNo() {
		return CarNo;
	}

	public void setCarNo(String CarNo) {
		this.CarNo = CarNo;
	}

	public String getManufacture() {
		return Manufacture;
	}

	public void setManufacture(String Manufacture) {
		this.Manufacture = Manufacture;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String Model) {
		this.Model = Model;
	}

	public int getKmsRan() {
		return KmsRan;
	}

	public void setKmsRan(int KmsRan) {
		this.KmsRan = KmsRan;
	}

	public int getPriceExpected() {
		return PriceExpected;
	}

	public void setPriceExpected(int PriceExpected) {
		this.PriceExpected = PriceExpected;
	}

	public int getNoOfOwners() {
		return NoOfOwners;
	}

	public void setNoOfOwners(int NoOfOwners) {
		this.NoOfOwners = NoOfOwners;
	}

}
