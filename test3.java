package com.orilore.yanxue.test;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class test3 {
	public static void main(String[] args){
//	FileOutputStream fout;
//	try {
//		fout = new FileOutputStream("");
//		DataOutputStream dout = new DataOutputStream(fout);
//		dout.writeInt(12);
//		dout.writeUTF("hello java word!!!");
//		dout.writeBoolean(true);
//		dout.flush();
//		dout.close();
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} 
	try {
		FileInputStream finput = new FileInputStream("");
		BufferedInputStream binput = new BufferedInputStream(finput);
		DataInputStream dinput = new DataInputStream(binput);
		int t1 = dinput.readInt();
		String t2 = dinput.readUTF();
		boolean t3 = dinput.readBoolean();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		dinput.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
