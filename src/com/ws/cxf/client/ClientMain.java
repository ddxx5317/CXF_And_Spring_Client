package com.ws.cxf.client;
import com.ws.cxf.HelloWord;
import com.ws.cxf.impl.HelloWordImpl;

public class ClientMain {

	public static void main(String[] args) {

		HelloWordImpl helloWordImpl = new HelloWordImpl(); 
		HelloWord helloWord = helloWordImpl.getHelloWordImplPort();

		
		String result = helloWord.sayHi("¥Û •");
		System.out.println(result);

	}

}
