package com.cucumber.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {

    private String filePath;
    private Workbook workbook;

    public ExcelUtils(String filePath) throws IOException {
        this.filePath = filePath;
        FileInputStream fis = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fis);
        fis.close();
    }

    public String getCellData(String sheetName, int rowNum, int colNum) {
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);
        return cell.toString();
    }

    public void setCellData(String sheetName, int rowNum, int colNum, String value) throws IOException {
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNum);
        if (row == null) row = sheet.createRow(rowNum);
        Cell cell = row.getCell(colNum);
        if (cell == null) cell = row.createCell(colNum);
        cell.setCellValue(value);
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
    }

    public void close() throws IOException {
        workbook.close();
    }
}
