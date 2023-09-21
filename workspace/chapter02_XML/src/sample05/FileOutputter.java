package sample05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//파일로 출력해주는 클래스
public class FileOutputter implements Outputter {
	private String filePath;
	private String fileName;

	public FileOutputter() {
		System.out.println("FileOutputter 기본 생성자");
	}
	
	public void setFilePath(String filePath) {
		System.out.println("public void setFilePath(String filePath)");
		this.filePath = filePath;
	}



	public void setFileName(String fileName) {
		System.out.println("public void setFilePath(String fileName)");
		this.fileName = fileName;
	}



	@Override
	public void output(String message) {
		System.out.println("public void output(String message)");
		
		try {
//		FileWriter filewiter = new FileWriter(filePath + fileName);
			FileWriter filewiter = new FileWriter(new File(filePath, fileName));
			filewiter.write(message);
			filewiter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
