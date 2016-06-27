package com.orilore.yanxue.test;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class test4 {
	public static void mian(String[] args){
//		Position p = new Position();
//		try {
//			FileOutputStream fout = new FileOutputStream("");
//			BufferedOutputStream bout = new BufferedOutputStream(fout);
//			ObjectOutputStream oout = new ObjectOutputStream(bout);
//			oout.writeObject(p);
//			oout.flush();
//			oout.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			FileInputStream finput = new FileInputStream("");
			ObjectInputStream oinput = new ObjectInputStream(finput);
			Position p = (Position)oinput.readObject();
			System.out.println(p.left);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
