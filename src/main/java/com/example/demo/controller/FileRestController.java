package com.example.demo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.patient.demo.Main;
import com.patient.demo.Patient;

@RestController
@RequestMapping("/api/file")
public class FileRestController {
	String name = "D:\\";
	
	private static String UPLOAD_DIR = "uploads";
	
	@PostMapping("/upload")
	public String upload(
			@RequestParam("file") MultipartFile file,
			HttpServletRequest request) {
		try {
			String fileName = file.getOriginalFilename();
			String path=  request.getServletContext().getRealPath("")
					     + UPLOAD_DIR + File.separator + fileName;
			saveFile(file.getInputStream(),path);
			name+=file.getOriginalFilename();
			return name;
			
		} catch (Exception e) {
			return e.getMessage();
		}
	
		}
	
	@GetMapping("/res")
      public Patient result() throws Exception {
	  Main obj=new Main();
	  String res[]=obj.getJson();
	  return new Patient(res[0],res[1],res[2],res[4],res[5]);
		
}
	
        private void saveFile(InputStream inputStream, String path) {
    	  try {
    		  OutputStream outputStream = new FileOutputStream(new File(path));
    		  int read =0;
    		  byte[] bytes= new byte[1024];
    		  while((read = inputStream.read(bytes))  != -1) {
    			  outputStream.write(bytes,0,read);
    		  }
    		  outputStream.flush();
    		  outputStream.close();
    	  } catch (Exception e) {
    		  e.printStackTrace();
    	  }
      }
}
