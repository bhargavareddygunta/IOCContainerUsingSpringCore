package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishGeneratorMessage;
import com.nt.sbeans.*;
public class DependencyInjectionTest {

	public static void main(String[] args) {
		 FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/Applicationcontext.xml");
		 Object obj = ctx.getBean("wgm");
		 WishGeneratorMessage generator = (WishGeneratorMessage)obj;
		 String result = generator.showMessage("Bhargav");
		 System.out.println(result);
		 ctx.close();

	}

}

