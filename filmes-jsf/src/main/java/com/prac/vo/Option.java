package com.prac.vo;

public class Option implements Comparable<Option>{

	private String label;
	private Object value;
	
	public Option() {
		// TODO Auto-generated constructor stub
	}
	
	public Option(String label, Object value){
		this.label = label;
		this.value = value;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	@Override
	public int compareTo(Option o) {
		// TODO Auto-generated method stub
		return this.getLabel().compareToIgnoreCase(o.getLabel());
	}
	
}
