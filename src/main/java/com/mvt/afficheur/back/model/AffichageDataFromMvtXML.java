package com.mvt.afficheur.back.model;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class AffichageDataFromMvtXML {

	public static void main(String[] args) {

		File xmlFile = new File("mvt.xml");
		 
		JAXBContext jaxbContext;
		try
		{
		    jaxbContext = JAXBContext.newInstance(Configuration.class);              
		 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 
		    Configuration configuration = (Configuration) jaxbUnmarshaller.unmarshal(xmlFile);
		     
		    System.out.println(configuration);
		}
		catch (JAXBException e) 
		{
		    e.printStackTrace();
		}
		 
}
}
