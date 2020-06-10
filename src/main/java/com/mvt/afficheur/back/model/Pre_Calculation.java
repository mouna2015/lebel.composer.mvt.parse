package com.mvt.afficheur.back.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

public class Pre_Calculation {
	
	private String Name;
	private int Position;
	private int Length;
	private String Type;
	private String Mapping_Expression;
	
	

	public Pre_Calculation() {
	}
	
	
	
	public Pre_Calculation(String name, int position, int length, String type, String mapping_Expression) {
		super();
		Name = name;
		Position = position;
		Length = length;
		Type = type;
		Mapping_Expression = mapping_Expression;
	}


	@XmlAttribute
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@XmlAttribute
	public int getPosition() {
		return Position;
	}
	public void setPosition(int position) {
		Position = position;
	}
	@XmlAttribute
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	@XmlAttribute
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	@XmlAttribute
	public String getMapping_Expression() {
		return Mapping_Expression;
	}
	public void setMapping_Expression(String mapping_Expression) {
		Mapping_Expression = mapping_Expression;
	}
	
	

}
