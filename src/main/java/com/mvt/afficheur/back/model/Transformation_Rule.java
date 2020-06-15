package com.mvt.afficheur.back.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * @author USER
 *
 */

@XmlRootElement(name="Transformation_Rule")
@XmlAccessorType
public class Transformation_Rule{
	

    @XmlElement
    private int Code;
    @XmlElement
	private String Label;
    @XmlElement
	private String Description;
    @XmlElement
	private Date Start;
    @XmlElement
	private Date End;
    @XmlElement
	private Date Update_Code;
    @XmlElement
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
	
	 
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	 

	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	 

	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	 

	public Date getStart() {
		return Start;
	}
	public void setStart(Date start) {
		Start = start;
	}
	 

	public Date getEnd() {
		return End;
	}
	public void setEnd(Date end) {
		End = end;
	}
	 

	public Date getUpdate_Code() {
		return Update_Code;
	}
	public void setUpdate_Code(Date update_Code) {
		Update_Code = update_Code;
	}
	 

	public int getBalancing_Rule_Application_Level() {
		return Balancing_Rule_Application_Level;
	}
	public void setBalancing_Rule_Application_Level(int balancing_Rule_Application_Level) {
		Balancing_Rule_Application_Level = balancing_Rule_Application_Level;
	}
	
	  @Override
	    public String toString() {
	        return "Person [Code=" + Code + ", Label=" + Label + ", Description=" + Description + ", Start=" + Start + ", End=" + End + ", Update_Code=" + Update_Code + ", Balancing_Rule_Application_Level=" + Balancing_Rule_Application_Level + "]";
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

	
}
