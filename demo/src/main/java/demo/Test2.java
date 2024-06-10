package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.aggregates.WorksheetProtectionBlock;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

//fibo(10);

//System.out.println(fact(4));;

		

	}
	
	public static void  fibo(int limit) {
		int a=0;
		int b= 1;
		
		
		System.out.print(a);
		System.out.print(b);
		for(int i=0; i<limit;i++) {
			int c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
		
	}
	
	public static Integer fact(int num) {
		if (num == 0)
			return 1;
		Integer fact =  num*fact(num-1); 
		return fact;
				
		
	}

}
