package com.brain.ccsb;

	import java.io.File;
	import java.io.IOException;

	//import jxl.Cell;
	//import jxl.Sheet;
	import jxl.Workbook;

	import jxl.read.biff.BiffException;

	import jxl.write.Label;
	import jxl.write.Number;
	import jxl.write.WritableSheet;
	import jxl.write.WritableWorkbook;
	import jxl.write.WriteException;

	public class rwexcel {
	   public static void main(String[] args) 
	      throws BiffException, IOException, WriteException
	   {
		  Workbook workbook1 = Workbook.getWorkbook(new File("/Users/ikumar/test.xls"));
	      WritableWorkbook wworkbook = Workbook.createWorkbook(new File("/Users/ikumar/test.xls"),workbook1);
	      WritableSheet wsheet = wworkbook.getSheet(0); 
	      Label label = new Label(0, 4, "Testing1");
	      wsheet.addCell(label);
	      Number number = new Number(3, 7, 34567891);
	      wsheet.addCell(number);
	      wworkbook.write();
	      wworkbook.close();

	  
	   }
	}


