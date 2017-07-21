package cn.fuwei.po;

public class ProvinceEx extends Province {
	private String totalNum;
	private String totalCap;
	
	private String totalNumBig;
	private String totalCapBig;
	
	private String totalNumMed;
	private String totalCapMed;
	
	private String totalNumSma;
	private String totalCapSma;
	
	public String getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public String getTotalCap() {
		return totalCap;
	}
	public void setTotalCap(String totalCap) {
		this.totalCap = totalCap;
	}
	public String getTotalNumBig() {
		return totalNumBig;
	}
	public void setTotalNumBig(String totalNumBig) {
		this.totalNumBig = totalNumBig;
	}
	public String getTotalCapBig() {
		return totalCapBig;
	}
	public void setTotalCapBig(String totalCapBig) {
		this.totalCapBig = totalCapBig;
	}
	public String getTotalNumMed() {
		return totalNumMed;
	}
	public void setTotalNumMed(String totalNumMed) {
		this.totalNumMed = totalNumMed;
	}
	public String getTotalCapMed() {
		return totalCapMed;
	}
	public void setTotalCapMed(String totalCapMed) {
		this.totalCapMed = totalCapMed;
	}
	public String getTotalNumSma() {
		return totalNumSma;
	}
	public void setTotalNumSma(String totalNumSma) {
		this.totalNumSma = totalNumSma;
	}
	public String getTotalCapSma() {
		return totalCapSma;
	}
	public void setTotalCapSma(String totalCapSma) {
		this.totalCapSma = totalCapSma;
	}
	public ProvinceEx() {
		// TODO Auto-generated constructor stub
	}
	
	public ProvinceEx(String totalNum, String totalCap, String totalNumBig, String totalCapBig, String totalNumMed,
			String totalCapMed, String totalNumSma, String totalCapSma) {
		super();
		this.totalNum = totalNum;
		this.totalCap = totalCap;
		this.totalNumBig = totalNumBig;
		this.totalCapBig = totalCapBig;
		this.totalNumMed = totalNumMed;
		this.totalCapMed = totalCapMed;
		this.totalNumSma = totalNumSma;
		this.totalCapSma = totalCapSma;
	}
	
	
}
