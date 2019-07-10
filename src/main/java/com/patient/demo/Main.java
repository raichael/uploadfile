package com.patient.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.json.simple.JSONObject;

public class Main {
	public String ret(String path,String value) throws Exception
	{
		 String temp="";
		 File file=new File(location);
		 FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String s;

		    while((s=br.readLine())!=null)
             {
               if(s.indexOf(value)==0)
               {
		            return s;
               }
	         }
		    return temp;
				    
    }
	public String sub(String s)
	{
		String temp="";
		StringTokenizer st=new StringTokenizer(s,":");
		st.nextToken();
		return st.nextToken();
	}
	
	
	static String location="D:\\sample.txt";
	public String[] getJson() throws Exception{
	Main main=new Main();
//    Patient pt=new Patient();
    String res[]=new String[6];
    String values[]= {"Name","Street Name","City","Postal Code","Phone","Email Address"};
    for(int i=0;i<values.length;i++)
    {
    	res[i]=main.sub(main.ret(location, values[i]));
    }
    
    Map<String,String> result=new LinkedHashMap<>();
    for(int i=0;i<values.length;i++)
    {
    	result.put(values[i], res[i]);
    }
    return res;
//    java.util.Iterator<Entry<String, String>> it= result.entrySet().iterator();
//    
//    JSONObject finalres = new JSONObject();
//
//	JSONObject patient = new JSONObject();
//
//	patient.put("name", result.get("Name"));
//	patient.put("phone", result.get("Phone"));
//	patient.put("email", result.get("Email Address"));
//
//	JSONObject Address = new JSONObject();
//	
//	Address.put("Street", result.get("Street Name"));
//	Address.put("City",result.get("City"));
//	Address.put("Pin Code", result.get("Postal Code"));
//	
//	
//	patient.put("address", Address);
//	
//	finalres.put("patient", patient);
//	
//    System.out.println(finalres.toString());
//    
//    System.out.print(finalres);
//		return finalres;
	
	}
	
    }

    
    
    
   
	  

