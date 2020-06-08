package com.mvt.afficheur.back.parsing;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.util.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MvtParsing {

	public static void main(String[] args) {

			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList nodeList = doc.getElementsByTagName("Common"); 
			// nodeList is not iterable, so we are using for loop  
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());  
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element eElement = (Element) node;  
			System.out.println("xmlVersion: "+ eElement.getAttribute("xmlVersion")); 
			System.out.println("Version: "+ eElement.getAttribute("Version")); 
			System.out.println("Label: "+ eElement.getAttribute("Label")); 
			System.out.println("Path: "+ eElement.getAttribute("Path")); 
			System.out.println("CreatedOn: "+ eElement.getAttribute("CreatedOn")); 
			System.out.println("CreatedBy: "+ eElement.getAttribute("CreatedBy")); 
			
			
			}  
			}
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			
			NodeList nodeList = doc.getElementsByTagName("Processing_Context_In"); 
			// nodeList is not iterable, so we are using for loop  
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());  
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element eElement = (Element) node;  
			System.out.println("Name: "+ eElement.getAttribute("Name")); 
			
			

			 NodeList childList = nodeList.item(itr).getChildNodes();
		        for (int j = 0; j < childList.getLength(); j++) {
		            Node childNode = childList.item(j);

		            if ("Auditing".equals(childNode.getNodeName())) {
		                System.out.println(childList.item(j).getNodeName());
		                
		        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

		                Element element1 = (Element) childNode;
		        		System.out.println("Position_Identifier_Stamping: "+ element1.getAttribute("Position_Identifier_Stamping"));
		        		System.out.println("Length_Identifier_Stamping: "+ element1.getAttribute("Length_Identifier_Stamping"));
		        		System.out.println("Type_Counter_Stamping: "+ element1.getAttribute("Type_Counter_Stamping"));
		        		System.out.println("Type_Stamping: "+ element1.getAttribute("Type_Stamping"));
		        		System.out.println("Stamping_Identifier_Completed: "+ element1.getAttribute("Stamping_Identifier_Completed"));
		        		}
		            }
			
		        
		        
		        
		         if ("Authorization".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("IEvent_No_Output: "+ element1.getAttribute("IEvent_No_Output"));
	        		System.out.println("Rule_No_Output: "+ element1.getAttribute("Rule_No_Output"));
	        		
	        		}
	            }
		
	        
		        if ("Check".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("Numeric: "+ element1.getAttribute("Numeric"));
	        		System.out.println("Existence_Table: "+ element1.getAttribute("Existence_Table"));
	        		System.out.println("Existence_Rule: "+ element1.getAttribute("Existence_Rule"));

	        		
	        		}
	            }
		
	        
		        if ("Choice".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("Aggregation: "+ element1.getAttribute("Aggregation"));
	        		System.out.println("Auditing: "+ element1.getAttribute("Auditing"));
	        		System.out.println("Balancing_Check: "+ element1.getAttribute("Balancing_Check"));
	        		System.out.println("Multi_Period: "+ element1.getAttribute("Multi_Period"));
	        		System.out.println("Group: "+ element1.getAttribute("Group"));
	        		System.out.println("Accounting_Processing: "+ element1.getAttribute("Accounting_Processing"));
	        		System.out.println("Recycling_Phase: "+ element1.getAttribute("Recycling_Phase"));


	        		
	        		}
	            }
		
	        
		        if ("Exit_Enrich".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("Segment: "+ element1.getAttribute("Segment"));
	        		System.out.println("Rule: "+ element1.getAttribute("Rule"));
	        		System.out.println("OSegt: "+ element1.getAttribute("OSegt"));
	        		
	        		}
	            }
		
	        
		        if ("Fixed".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("Position_Code_Group: "+ element1.getAttribute("Position_Code_Group"));
	        		System.out.println("Length_Code_Group: "+ element1.getAttribute("Length_Code_Group"));
	        		System.out.println("Type_Code_Group: "+ element1.getAttribute("Type_Code_Group"));
	        		System.out.println("Position_Code_IEvent: "+ element1.getAttribute("Position_Code_IEvent"));
	        		System.out.println("Length_Code_IEvent: "+ element1.getAttribute("Length_Code_IEvent"));
	        		System.out.println("Position_Version_IEvent: "+ element1.getAttribute("Position_Version_IEvent"));
	        		System.out.println("Length_Version_IEvent: "+ element1.getAttribute("Length_Version_IEvent"));
	        		System.out.println("Type_Version_IEvent: "+ element1.getAttribute("Type_Version_IEvent"));
	        		System.out.println("Position_Date_Application_Rule: "+ element1.getAttribute("Position_Date_Application_Rule"));
	        		System.out.println("Length_Date_Application_Rule: "+ element1.getAttribute("Length_Date_Application_Rule"));
	        		System.out.println("Type_Date_Application_Rule: "+ element1.getAttribute("Type_Date_Application_Rule"));
	        		System.out.println("Position_Code_Instance: "+ element1.getAttribute("Position_Code_Instance"));
	        		System.out.println("Length_Code_Instance: "+ element1.getAttribute("Length_Code_Instance"));
	        		System.out.println("Type_Code_Instance: "+ element1.getAttribute("Type_Code_Instance"));
	        		System.out.println("Position_Code_Segt: "+ element1.getAttribute("Position_Code_Segt"));
	        		System.out.println("Length_Code_Segt: "+ element1.getAttribute("Length_Code_Segt"));
	        		System.out.println("Position_Code_Reversal: "+ element1.getAttribute("Position_Code_Reversal"));
	        		System.out.println("Position_Code_Output: "+ element1.getAttribute("Position_Code_Output"));
	        		System.out.println("Length_Code_Output: "+ element1.getAttribute("Length_Code_Output"));


	        		
	        		}
	            }
		
	        
			
		        if ("Ident_Type".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("Code_IEvent: "+ element1.getAttribute("Code_IEvent"));
	        		System.out.println("IEvent_Version: "+ element1.getAttribute("IEvent_Version"));
	        		System.out.println("Date_Application_Rule: "+ element1.getAttribute("Date_Application_Rule"));
	        		System.out.println("Code_Segt: "+ element1.getAttribute("Code_Segt"));
	        		System.out.println("Code_Instance: "+ element1.getAttribute("Code_Instance"));
	        		System.out.println("Code_Group: "+ element1.getAttribute("Code_Group"));
	        		System.out.println("Code_Balance_Check: "+ element1.getAttribute("Code_Balance_Check"));
	        		System.out.println("Code_Reversal: "+ element1.getAttribute("Code_Reversal"));
	        		System.out.println("Type_Version_IEvent: "+ element1.getAttribute("Type_Version_IEvent"));
	        		System.out.println("Code_Output: "+ element1.getAttribute("Code_Output"));
	        		System.out.println("Rule_Balancing: "+ element1.getAttribute("Rule_Balancing"));
	        		System.out.println("Rule_Aggregation: "+ element1.getAttribute("Rule_Aggregation"));
	        		System.out.println("Rule_Audit: "+ element1.getAttribute("Rule_Audit"));

	        		
	        		}
	            }
		        
		        if ("Limit".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("Segt_IEvent: "+ element1.getAttribute("Segt_IEvent"));
	        		System.out.println("IEvent_Rejected: "+ element1.getAttribute("IEvent_Rejected"));
	        		System.out.println("IEvent_Group_Rejected: "+ element1.getAttribute("IEvent_Group_Rejected"));
	        		System.out.println("Percentage_IEvent_Rejected: "+ element1.getAttribute("Percentage_IEvent_Rejected"));
	        		System.out.println("Stop_Phase_First_Anomaly: "+ element1.getAttribute("Stop_Phase_First_Anomaly"));
	        		System.out.println("Group_Rejected: "+ element1.getAttribute("Group_Rejected"));
	        	
	        		
	        		}
	            }
		        
		        
		        if ("Optimization".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("Length_OSegt: "+ element1.getAttribute("Length_OSegt"));
	        		System.out.println("Rtrim_OSegt: "+ element1.getAttribute("Rtrim_OSegt"));
	        		
	        		}
	            }
		        
		        if ("Value".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("Code_Balance_Check: "+ element1.getAttribute("Code_Balance_Check"));	        		
	        		}
	            }
		        
		       
			
			}  
			}
			}
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
	
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			
			NodeList nodeList = doc.getElementsByTagName("Input_Event"); 
			// nodeList is not iterable, so we are using for loop  
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());  
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element eElement = (Element) node;  
			System.out.println("Code: "+ eElement.getAttribute("Code")); 
			System.out.println("Version: "+ eElement.getAttribute("Version")); 
			
			
			

			 NodeList childList = nodeList.item(itr).getChildNodes();
		        for (int j = 0; j < childList.getLength(); j++) {
		            Node childNode = childList.item(j);

		            if ("Validity".equals(childNode.getNodeName())) {
		                System.out.println(childList.item(j).getNodeName());
		                
		                NodeList firstList = childList.item(j).getChildNodes();
		                for (int i = 0;i<firstList.getLength();i++) {
		                	
		                	Node first = firstList.item(i);
		                	
		          	if ("Period".equals(first.getNodeName())) {
		    	                System.out.println(firstList.item(i).getNodeName());
		    	                
		    	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

		    	                Element element1 = (Element) first;
	    	 	        		System.out.println("Start: "+ element1.getAttribute("Start"));
	    	 	        		System.out.println("End: "+ element1.getAttribute("End"));
		    	        		
		    	        		}
		                	}
		                }
		            }

	    	          if ("IEvent_Rule".equals(childNode.getNodeName())) {
	    			       System.out.println(childList.item(j).getNodeName());
	    			       
	    			       NodeList firstList = childList.item(j).getChildNodes();
	   	                for (int i = 0;i<firstList.getLength();i++) {
	   	                	
	   	                	Node first = firstList.item(i);
	   	                	
	   	                	if ("Processing".equals(first.getNodeName())) {
	   	    	                System.out.println(firstList.item(i).getNodeName());
	   	    	                
	   	    	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	   	    	                Element element1 = (Element) first;
	       	 	        		System.out.println("Segt_IEvent: "+ element1.getAttribute("Segt_IEvent"));
	       	 	        		System.out.println("Rank: "+ element1.getAttribute("Rank"));
	       	 	        		
	       	 	        		
	       	 	        	  NodeList secondList = firstList.item(i).getChildNodes();
	    		                for (int n = 0;n<secondList.getLength();n++) {
	    		                	
	    		                	Node second = secondList.item(n);
	    		                	
	    		                	if ("Audit_Rule".equals(second.getNodeName())) {
	    		    	                System.out.println(secondList.item(i).getNodeName());
	    		    	                
	    		    	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	    		    	                Element element2 = (Element) second;
	    	    	 	        		System.out.println("Code"+ element2.getAttribute("Code"));
	    		    	        		}
	    		                	}
	    	    	 	        		
	    	    	 	        		if ("Transformation_Rule".equals(second.getNodeName())) {
		    		    	                System.out.println(secondList.item(i).getNodeName());
		    		    	                
		    		    	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

		    		    	                Element element2 = (Element) second;
		    	    	 	        		System.out.println("Code"+ element2.getAttribute("Code"));
	   	                	}
	   	    	                }
	    			          
	    		                	}
	    		                }
		    	        		}
		                	}
		                }
		            }
		        }
			}
			
			}   
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			
			NodeList nodeList = doc.getElementsByTagName("Aggregation_Rule"); 
			// nodeList is not iterable, so we are using for loop  
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());  
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element eElement = (Element) node;  
			System.out.println("Name: "+ eElement.getAttribute("Name")); 
			System.out.println("Start: "+ eElement.getAttribute("Start")); 
			System.out.println("End: "+ eElement.getAttribute("End")); 
			System.out.println("Final_Aggregated_Segment: "+ eElement.getAttribute("Final_Aggregated_Segment")); 

			
			
			
	          NodeList nodeList1 = doc.getDocumentElement().getChildNodes();
	          for (int i = 0; i < nodeList1.getLength(); i++) {
	               Node node1 = nodeList.item(i);
	  
	               if (node1.getNodeType() == Node.ELEMENT_NODE) {
	                    Element elem = (Element) node;
	               }
	          }
			
			
			
			
			
			
			} 
			}
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList nodeList = doc.getElementsByTagName("Audit_Rule"); 
			// nodeList is not iterable, so we are using for loop  
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());  
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element eElement = (Element) node;  
			System.out.println("Name: "+ eElement.getAttribute("Name")); 
			System.out.println("Start: "+ eElement.getAttribute("Start")); 
			System.out.println("End: "+ eElement.getAttribute("End")); 
			System.out.println("Final_Aggregated_Segment: "+ eElement.getAttribute("Financial_Tag")); 

			}  
			}
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList nodeList = doc.getElementsByTagName("Balancing_Rule"); 
			// nodeList is not iterable, so we are using for loop  
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());  
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element eElement = (Element) node;  
			System.out.println("Name: "+ eElement.getAttribute("Name")); 
			System.out.println("Start: "+ eElement.getAttribute("Start")); 
			System.out.println("End: "+ eElement.getAttribute("End")); 
			System.out.println("Financial_Tag: "+ eElement.getAttribute("Financial_Tag")); 

			}  
			}
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList nodeList = doc.getElementsByTagName("Processing_Context_Out"); 
			// nodeList is not iterable, so we are using for loop  
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());  
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element eElement = (Element) node;  
			System.out.println("Name: "+ eElement.getAttribute("Name")); 
			
			}  
			}
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList nodeList = doc.getElementsByTagName("Environment_Transformation"); 
			// nodeList is not iterable, so we are using for loop  
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());  
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element eElement = (Element) node;  
			
			}  
			}
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
			
			NodeList nodeList = doc.getElementsByTagName("Transformation_Rule"); 
			// nodeList is not iterable, so we are using for loop  
			parseTransformationRules(nodeList);
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			
			try   
			{  
			//creating a constructor of file class and parsing an XML file  
			File file = new File("mvt.xml");  
			//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			
			NodeList nodeList = doc.getElementsByTagName("Output_Structure"); 
			// nodeList is not iterable, so we are using for loop  
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			Node node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());  
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element eElement = (Element) node;  
			System.out.println("Code: "+ eElement.getAttribute("Code")); 
			
			
			}  
			}
			}
			catch (Exception e)   
			{  
			e.printStackTrace();  
			}  
			
			
	
	
	try   
	{  
	//creating a constructor of file class and parsing an XML file  
	File file = new File("mvt.xml");  
	//an instance of factory that gives a document builder  
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
	//an instance of builder to parse the specified xml file  
	DocumentBuilder db = dbf.newDocumentBuilder();  
	Document doc = db.parse(file);  
	doc.getDocumentElement().normalize();  
	
	NodeList nodeList = doc.getElementsByTagName("Variable"); 
	// nodeList is not iterable, so we are using for loop  
	for (int itr = 0; itr < nodeList.getLength(); itr++)   
	{  
	Node node = nodeList.item(itr);  
	System.out.println("\nNode Name :" + node.getNodeName());  
	if (node.getNodeType() == Node.ELEMENT_NODE)   
	{  
	Element eElement = (Element) node;  
	System.out.println("Name: "+ eElement.getAttribute("Name")); 
	System.out.println("Label: "+ eElement.getAttribute("Label")); 
	System.out.println("Rank: "+ eElement.getAttribute("Rank")); 
	System.out.println("Frequency: "+ eElement.getAttribute("Frequency")); 
	System.out.println("Length: "+ eElement.getAttribute("Length")); 
	System.out.println("Type: "+ eElement.getAttribute("Type")); 
	System.out.println("Decimal_Number: "+ eElement.getAttribute("Decimal_Number")); 
	System.out.println("Initial_Value: "+ eElement.getAttribute("Initial_Value")); 
	
	}  
	}
	}
	catch (Exception e)   
	{  
	e.printStackTrace();  
	}  
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	/**
	 * @param nodeList
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	private static void parseTransformationRules(NodeList nodeList) throws ParserConfigurationException, SAXException, IOException {
		for (int itr = 0; itr < nodeList.getLength(); itr++)   
		{  
		Node node = nodeList.item(itr);  
		System.out.println("\nNode Name :" + node.getNodeName());  
		if (node.getNodeType() == Node.ELEMENT_NODE)   
		{    
		Element eElement = (Element) node;  
		System.out.println("Code: "+ eElement.getAttribute("Code")); 
		System.out.println("Label: "+ eElement.getAttribute("Label")); 
		System.out.println("Description: "+ eElement.getAttribute("Description")); 
		System.out.println("Start: "+ eElement.getAttribute("Start")); 
		System.out.println("End: "+ eElement.getAttribute("End")); 
		System.out.println("Update_Code: "+ eElement.getAttribute("Update_Code")); 
		System.out.println("Balancing_Rule_Application_Level: "+ eElement.getAttribute("Balancing_Rule_Application_Level"));
		
		
		 NodeList childList = nodeList.item(itr).getChildNodes();
	        for (int j = 0; j < childList.getLength(); j++) {
	            Node childNode = childList.item(j);

	            if ("Pre_Calculation".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	                Element element1 = (Element) childNode;
	        		System.out.println("Name: "+ element1.getAttribute("Name"));
	        		System.out.println("Position: "+ element1.getAttribute("Position"));
	        		System.out.println("Length: "+ element1.getAttribute("Length"));
	        		System.out.println("Type: "+ element1.getAttribute("Type"));
	        		System.out.println("Mapping_Expression: "+ element1.getAttribute("Mapping_Expression"));
	        		}
	            }
	        
	            
	            if ("Input_Event_Structure".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	              
	                NodeList firstList = childList.item(j).getChildNodes();
	                for (int i = 0;i<firstList.getLength();i++) {
	                	
	                	Node first = firstList.item(i);
	                	
	                	if ("Field".equals(first.getNodeName())) {
	    	                System.out.println(firstList.item(i).getNodeName());
	    	                
	    	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	    	                Element element1 = (Element) first;
    	 	        		System.out.println("Name: "+ element1.getAttribute("Name"));
    	 	        		System.out.println("Label: "+ element1.getAttribute("Label"));
    	 	        		System.out.println("Position: "+ element1.getAttribute("Position"));
    	 	        		System.out.println("Length: "+ element1.getAttribute("Length"));
    	 	        		System.out.println("Type: "+ element1.getAttribute("Type"));
    	 	        		System.out.println("Decimal_Number: "+ element1.getAttribute("Decimal_Number"));
    	 	        		System.out.println("Test_Code: "+ element1.getAttribute("Test_Code"));	
	                	}
	    	                }
	    	                
	                
	    	                
	    	                
	    	                
	                
	                }
	            }
	        
	            
	            
	            if ("Output_Mappings".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());

	                
	                NodeList firstList = childList.item(j).getChildNodes();
	                for (int i = 0;i<firstList.getLength();i++) {
	                	
	                	Node first = firstList.item(i);
	                	
	                	if ("Output_Mapping".equals(first.getNodeName())) {
	    	                System.out.println(firstList.item(i).getNodeName());
	    	                
	    	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	    	                Element element1 = (Element) first;
    	 	        		System.out.println("Code: "+ element1.getAttribute("Code"));
    	 	        		System.out.println("Output_Number: "+ element1.getAttribute("Output_Number"));
    	 	        		System.out.println("Condition: "+ element1.getAttribute("Condition"));
    	 	        		System.out.println("Update_Date: "+ element1.getAttribute("Update_Date"));
    	 	        		System.out.println("Cyclic_Output: "+ element1.getAttribute("Cyclic_Output"));
    	 	        		System.out.println("OutputInit: "+ element1.getAttribute("OutputInit"));
    	 	        		System.out.println("OutputMemo: "+ element1.getAttribute("OutputMemo"));	
    	 	        		System.out.println("OutputOccurs: "+ element1.getAttribute("OutputOccurs"));	

	    	        	
    	 	        		NodeList secondList = firstList.item(i).getChildNodes();
    		                for (int n = 0;n<secondList.getLength();n++) {
    		                	
    		                	Node second = secondList.item(n);
    		                	
    		                	if ("Mapping".equals(second.getNodeName())) {
    		    	                System.out.println(secondList.item(i).getNodeName());
    		    	                
    		    	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

    		    	                Element element2 = (Element) second;
    	    	 	        		System.out.println("Name: "+ element2.getAttribute("Name"));
    	    	 	        		System.out.println("Expression: "+ element2.getAttribute("Expression"));
    		    	        		
    		                	}
    		    	                }
    		                }
	    	        		}
	                	}
	                }
	            }
	            
	            if ("Financial_Cases".equals(childNode.getNodeName())) {
	                System.out.println(childList.item(j).getNodeName());
	                
	                NodeList firstList = childList.item(j).getChildNodes();
	                for (int i = 0;i<firstList.getLength();i++) {
	                	
	                	Node first = firstList.item(i);
	                	
	                	if ("Financial_Case".equals(first.getNodeName())) {
	    	                System.out.println(firstList.item(i).getNodeName());
	    	                
	    	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

	    	                Element element1 = (Element) first;
    	 	        		System.out.println("Number: "+ element1.getAttribute("Number"));
    	 	        		System.out.println("Priority_Code: "+ element1.getAttribute("Priority_Code"));
    	 	        		System.out.println("Update_Date: "+ element1.getAttribute("Update_Date"));
    	 	        		System.out.println("Update_Date: "+ element1.getAttribute("Update_Date"));
    	 	        		System.out.println("Exclusive_Code: "+ element1.getAttribute("Exclusive_Code"));
    	 	        		
    	 	        		
    	 	        		NodeList secondList = firstList.item(i).getChildNodes();
    		                for (int n = 0;n<secondList.getLength();n++) {
    		                	
    		                	Node second = secondList.item(n);
    		                	
    		                	if ("Output_Number".equals(second.getNodeName())) {
    		    	                System.out.println(secondList.item(i).getNodeName());
    		    	                
    		    	        		if (childNode.getNodeType() == Node.ELEMENT_NODE) {  

    		    	                Element element2 = (Element) second;
    	    	 	        		System.out.println("Output_Number"+ element2.getAttribute("Output_Number"));
    		    	        		
    		                	}
    		    	                }
    		                	}
    		    	                }
	                	}
	    	                }
	                
	                
	                
	            
	                
	            }
	                
	        		
	            }
	            
	            
	            
	            
	        
	            
	            }
	    			
	    	        
	            
	        
	            
		}
		
		
	}

}


		
	
		
		
		
		
		
		
		
	
		
		
		
	


