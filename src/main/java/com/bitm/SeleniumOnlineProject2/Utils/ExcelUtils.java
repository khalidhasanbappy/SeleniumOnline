package com.bitm.SeleniumOnlineProject2.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.SeleniumOnlineProject2.DTO.LoginDTO;



public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook = null;

	private static Sheet getSheet(int sheetNo) throws IOException {

		//Get the file
		File f = new File("src/main/java");
		File fs = new File(f, "data.xlsx.xlsx");
		inputStream = new FileInputStream(new File(fs.getAbsolutePath()));

		//Get Workbook
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(sheetNo);
		return sheet;

	}
	
	//Login Test

	public static  List<LoginDTO> getLoginData() throws IOException {

		List<LoginDTO> logindata = new ArrayList<LoginDTO>();
		DataFormatter formater = new DataFormatter();


		Iterator<Row> rowiterator = ExcelUtils.getSheet(0).iterator();
		while(rowiterator.hasNext()){

			Row nextRow = rowiterator.next();

			Iterator<Cell> celliterator =nextRow.cellIterator();
			LoginDTO login = new LoginDTO();
			byte cellcounter = 0;
			while(celliterator.hasNext()) {

				Cell cellNext = celliterator.next();

				switch (cellcounter) {
				case 0:
					login.setUsarname(formater.formatCellValue(cellNext));
					cellcounter++;

					break;

				case 1:
					login.setPassword(formater.formatCellValue(cellNext));
					cellcounter++;
					break;

				case 2:
					login.setUsarname(formater.formatCellValue(cellNext));
					cellcounter++;

					break;

				case 3:
					login.setPassword(formater.formatCellValue(cellNext));

					break;




				}

			}
			logindata.add(login);

		}
		close();
		return logindata;




	}

	private static void close() throws IOException {
		workbook.close();
		inputStream.close();
		
	}




}
