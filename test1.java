package com.orilore.yanxue.test;
import java.util.*;
import java.io.*;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
public class test1 {
	public static void main(String[] args){
		try {
			String downur1 = "";
			URL url = new URL(downur1);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			//FileInoutStream finput1 = new FileInputStream();
			//finput1.read();
			String path = "";
			String type = downur1.substring(downur1.lastIndexOf(0));
			Date date = new Date();
			long time = date.getTime();
			String filename = path+""+time+type;
			InputStream input = conn.getInputStream();
			BufferedInputStream binput = new BufferedInputStream(input);
			//字节流
			//输出流的祖宗OutputStream->FileOutputStream BufferedOutputStream DateOutputStream objectInputStream
			//输入流的祖宗InputStream->FileInputStream BufferedInputStream DateInputStream objectInputStream
			FileOutputStream fout = new FileOutputStream(filename);
			BufferedOutputStream bout = new BufferedOutputStream(fout); 
			long t1 = System.currentTimeMillis();
			//每次读512个字节
			//byte[] cache = new byte[512];
			//int readlength = 0;
			//while((readlength=input.read(cache))!=-1){
			//fout.write(cache,0,readlength);
		    //}
			//每次读一个字节
			int read = 0;
			while((read=binput.read())!=-1){
				bout.write(read);
			}
			fout.flush();
			fout.close();
			input.close();
			long t2 =System.currentTimeMillis();
			System.out.println(t2-t1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
