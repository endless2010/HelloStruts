package com.mycompany.upload.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class MultipleFileUploadAction extends ActionSupport {
	private List<File> upload;
	private List<String> uploadContentType;
	private List<String> uploadFileName;
	private String savePath;

	public String execute() throws Exception {
		for (int i = 0; i < upload.size(); ++i) {
			String saveFile = ServletActionContext.getServletContext()
					.getRealPath(savePath + "/" + uploadFileName.get(i));
			FileOutputStream out = new FileOutputStream(saveFile);
			FileInputStream in = new FileInputStream(upload.get(i));
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = in.read(buffer)) > 0)
				out.write(buffer, 0, len);
			in.close();
			out.close();
		}
		return "success";
	}

	public List<File> getUpload() {
		return upload;
	}

	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	public List<String> getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
}
