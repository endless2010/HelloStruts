package com.mycompany.upload.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class SimpleUploadAction extends ActionSupport{
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;
	
	public String execute()throws Exception{
		String saveFile=ServletActionContext.getServletContext().getRealPath
				(savePath+"/"+uploadFileName);
		FileOutputStream out=new FileOutputStream(saveFile);
		FileInputStream in=new FileInputStream(upload);
		byte[] buffer=new byte[1024];
		int len=0;
		while((len=in.read(buffer))>0)
			out.write(buffer,0,len);
		in.close();
		out.close();
		return "success";
	}
	
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContextType() {
		return uploadContentType;
	}
	public void setUploadContextType(String uploadContextType) {
		this.uploadContentType = uploadContextType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
}
