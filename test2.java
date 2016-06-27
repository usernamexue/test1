package com.orilore.yanxue.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class test2 {
	public static void mian(String[] args){
		try {
			//FileoutputStream fout = new FileoutputStream("");
			//String hello = "ÄãºÃ";
			//String hello2 = "ÄãºÃ2";
			//byte[] strbyte = hello.getBytes();
			//byte[] strbyte2 = hello2.getBytes();
			//fout.write(strbyte);
			//fout.write(strbyte2);
			//fout.flush();
			//fout.close();
			FileInputStream input = new FileInputStream("");
			String hello = "ÄãºÃ";
			byte[] bs = hello.getBytes();
			byte[] newbs = new byte[bs.length];
			input.read(newbs);
			String str = new String(newbs);
			System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
