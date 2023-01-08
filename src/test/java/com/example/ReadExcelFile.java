package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

    public String readExcel(int row, int cell) throws IOException {

        FileInputStream file = new FileInputStream(
                new File("C:\\Users\\CemPolat\\Desktop\\Testinium\\demo\\upload\\Book 1.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Row excelRow = sheet.getRow(row);
        Cell excelCell = excelRow.getCell(cell);

        String value = excelCell.getStringCellValue();

        workbook.close();
        file.close();

        return value;
    }
}
