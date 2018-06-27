package com.test;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class PoiTest {

	public static void main(String[] args) throws Exception {

		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		Employee emp=new Employee("Naseer","26","2362");
		Employee emp1=new Employee("Hari","28","2366");
		Employee emp2=new Employee("Sai","29","2364");

		List<Employee> al=new ArrayList<Employee>();
		al.add(emp);
		al.add(emp1);
		al.add(emp2);

		int rowCount = 0;
		int cellcount=0;

		for (Employee eobj : al) {
			Row row = sheet.createRow(++rowCount);

			Cell cell = row.createCell(0);
			cell.setCellValue(eobj.getEmpName());

			cell = row.createCell(1);
			cell.setCellValue(eobj.getEmpAge());

			cell = row.createCell(2);
			cell.setCellValue(eobj.getEmpID());
		}

		try (FileOutputStream outputStream = new FileOutputStream("Write.xls")) {
			workbook.write(outputStream);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
