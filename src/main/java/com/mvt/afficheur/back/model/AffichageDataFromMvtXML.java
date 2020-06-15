package com.mvt.afficheur.back.model;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRegistry;


public class AffichageDataFromMvtXML {

	public static void main(String[] args) {

		 File file = new File("src/main/resources/mvt.xml");

	        try {
	            JAXBContext context = JAXBContext.newInstance(Configuration.class);
	            Unmarshaller unmarshaller = context.createUnmarshaller();
                 Configuration configuration = (Configuration) unmarshaller.unmarshal(file);

	           System.out.println(configuration.getListTransformation_Rule().size());

	            for (int i = 0; i < configuration.getListTransformation_Rule().size(); i++) {
	                System.out.println("------------");
	                System.out.println(configuration.getListTransformation_Rule().get(i).getCode());
	                System.out.println(configuration.getListTransformation_Rule().get(i).getLabel());
	                System.out.println(configuration.getListTransformation_Rule().get(i).getDescription());
	                System.out.println(configuration.getListTransformation_Rule().get(i).getStart());
	                System.out.println(configuration.getListTransformation_Rule().get(i).getEnd());
	                System.out.println(configuration.getListTransformation_Rule().get(i).getUpdate_Code());
	                System.out.println(configuration.getListTransformation_Rule().get(i).getBalancing_Rule_Application_Level());




	            }

	        } catch (JAXBException e) {
	            System.out.println(e.getMessage());
	        }
	    }
		
	
}
