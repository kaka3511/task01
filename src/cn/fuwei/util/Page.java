package cn.fuwei.util;

public class Page {
	private Integer total;
	private Integer start;
	private Integer offset;
	public Page() {
		
	}
	public Page(Integer total, Integer start, Integer offset) {
		super();
		this.total = total;
		this.start = start;
		this.offset = offset;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	
}
