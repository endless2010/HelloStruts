package com.mycompany.type.actions;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TypeTestAction {
	private boolean booleanType;
	private char charType;
	private Integer intType;
	private Long longType;
	private float floatType;
	private double doubleType;
	private Date dateType;
	private String[] arrayType;
	private List<String> collectionType;
	
	public String execute()throws Exception{
		System.out.println("booleanType:"+booleanType);
		System.out.println("charType:"+charType);
		System.out.println("intType:"+intType);
		System.out.println("longType:"+longType);
		System.out.println("floatType:"+floatType);
		System.out.println("doubleType:"+doubleType);
		System.out.println("dateType:"+dateType);
		System.out.println("arrayType:"+Arrays.toString(arrayType));
		System.out.println("collectionType:"+collectionType);
		return "success";
	}
	public boolean isBooleanType() {
		return booleanType;
	}
	public void setBooleanType(boolean booleanType) {
		this.booleanType = booleanType;
	}
	public char getCharType() {
		return charType;
	}
	public void setCharType(char charType) {
		this.charType = charType;
	}
	public Integer getIntType() {
		return intType;
	}
	public void setIntType(Integer intType) {
		this.intType = intType;
	}
	public Long getLongType() {
		return longType;
	}
	public void setLongType(Long longType) {
		this.longType = longType;
	}
	public float getFloatType() {
		return floatType;
	}
	public void setFloatType(float floatType) {
		this.floatType = floatType;
	}
	public double getDoubleType() {
		return doubleType;
	}
	public void setDoubleType(double doubleType) {
		this.doubleType = doubleType;
	}
	public Date getDateType() {
		return dateType;
	}
	public void setDateType(Date dateType) {
		this.dateType = dateType;
	}
	public String[] getArrayType() {
		return arrayType;
	}
	public void setArrayType(String[] arrayType) {
		this.arrayType = arrayType;
	}
	public List<String> getCollectionType() {
		return collectionType;
	}
	public void setCollectionType(List<String> collectionType) {
		this.collectionType = collectionType;
	}
}
