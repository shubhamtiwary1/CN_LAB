package exp2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "D:\\\\2141020022\\\\size.txt";
		long startTime = System.currentTimeMillis();
		int ch;
		try {
			FileInputStream fin = new FileInputStream(filepath);
			BufferedInputStream bin = new BufferedInputStream(fin);
			while((ch = bin.read()) != -1) {}
		}
		catch (IOException e){
			System.out.println(e);
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime-startTime;
		System.out.println("Time taken with buffering : " + duration + " milliseconds.");
	}

}
