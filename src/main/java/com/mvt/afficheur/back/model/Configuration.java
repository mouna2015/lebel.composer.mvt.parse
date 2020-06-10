package com.mvt.afficheur.back.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "Configuration")
public class Configuration implements Serializable  {
	
	
	  private static final long serialVersionUID = 1L;
	
     private Transformation_Rule transformation_Rule;
     
     

	public Configuration() {
	}



	public Configuration(Transformation_Rule transformation_Rule) {
		super();
		this.transformation_Rule = transformation_Rule;
	}


	@XmlElement

	public Transformation_Rule getTransformation_Rule() {
		return transformation_Rule;
	}



	public void setTransformation_Rule(Transformation_Rule transformation_Rule) {
		this.transformation_Rule = transformation_Rule;
	}
	
	 @Override
	    public String toString() {
	        return "Configuration [transformation_Rule="+ transformation_Rule + "]";
	    }
		 
		    }


		
		
		
		
