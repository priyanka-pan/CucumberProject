package com.Helper;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public ConfigurationReader getInstanceCR() throws Throwable {
		ConfigurationReader cr=new ConfigurationReader();
		return cr;
	}
	
	public static FileReaderManager getInstanceFileReaderManager() {
		FileReaderManager frm=new FileReaderManager();
		return frm;
	}
}
