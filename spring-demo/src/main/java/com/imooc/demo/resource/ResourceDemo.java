package com.imooc.demo.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.*;

/**
 */
public class ResourceDemo {

	public static void main(String[] args) throws IOException {
		FileSystemResource fileSystemResource
				= new FileSystemResource("/Users/tianyu/IdeaProjects/spring-framework-5.2.0.RELEASE/spring-demo/src/main/java/com/imooc/demo/resource/demo.txt");
		File file = fileSystemResource.getFile();
		System.out.println(file.length());

		OutputStream outputStream = fileSystemResource.getOutputStream();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		bufferedWriter.write("Hello World");
		bufferedWriter.flush();
		outputStream.close();
		bufferedWriter.close();
	}
}
