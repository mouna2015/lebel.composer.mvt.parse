package com.mvt.afficheur.back.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "Transformation_Rule")

public class Transformation_Rule implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int Code;
	private String Label;
	private String Description;
	private Date Start;
	private Date End;
	private Date Update_Code;
	private int Balancing_Rule_Application_Level;
	
	//private List <Pre_Calculation> listPre_Calculation;
	
	public Transformation_Rule() {
		
	}
	
	public Transformation_Rule(int code, String label, String description, Date start, Date end, Date update_Code,
			int balancing_Rule_Application_Level) {
		super();
		Code = code;
		Label = label;
		Description = description;
		Start = start;
		End = end;
		Update_Code = update_Code;
		Balancing_Rule_Application_Level = balancing_Rule_Application_Level;
	//	this.listPre_Calculation = listPre_Calculation;
	}
	
	@XmlAttribute  
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	@XmlAttribute
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	@XmlAttribute
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@XmlAttribute
	public Date getStart() {
		return Start;
	}
	public void setStart(Date start) {
		Start = start;
	}
	@XmlAttribute
	public Date getEnd() {
		return End;
	}
	public void setEnd(Date end) {
		End = end;
	}
	@XmlAttribute
	public Date getUpdate_Code() {
		return Update_Code;
	}
	public void setUpdate_Code(Date update_Code) {
		Update_Code = update_Code;
	}
	@XmlAttribute
	public int getBalancing_Rule_Application_Level() {
		return Balancing_Rule_Application_Level;
	}
	public void setBalancing_Rule_Application_Level(int balancing_Rule_Application_Level) {
		Balancing_Rule_Application_Level = balancing_Rule_Application_Level;
	}
	/*
	@XmlElement 
	public List<Pre_Calculation> getListPre_Calculation() {
		return listPre_Calculation;
	}

	public void setListPre_Calculation(List<Pre_Calculation> listPre_Calculation) {
		this.listPre_Calculation = listPre_Calculation;
	}
	
	*/

	
	 @Override
	    public String toString() {
	        return "Transformation_Rule [Code=" + Code + ", Label=" + Label + ", Description=" + Description + ", Start=" + Start + ", End=" + End + ", Update_Code=" + Update_Code + ", Balancing_Rule_Application_Level=" + Balancing_Rule_Application_Level + "]";
	    }
}
