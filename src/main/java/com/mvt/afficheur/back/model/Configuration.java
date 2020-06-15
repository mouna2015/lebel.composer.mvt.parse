package com.mvt.afficheur.back.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement(name="Configuration")
@XmlAccessorType

public class Configuration  {
	

	 private List<Transformation_Rule> listTransformation_Rule = new ArrayList<Transformation_Rule>();

	public Configuration() {
	}

	public Configuration(List<Transformation_Rule> listTransformation_Rule) {
		super();
		this.listTransformation_Rule = listTransformation_Rule;
	}

	public List<Transformation_Rule> getListTransformation_Rule() {
		return listTransformation_Rule;
	}

	public void setListTransformation_Rule(List<Transformation_Rule> listTransformation_Rule) {
		this.listTransformation_Rule = listTransformation_Rule;
	}
	
	

	
     
    
		    }


		
		
		
		
