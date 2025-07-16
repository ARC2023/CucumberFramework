package com.cucumber.utils;

public class ExcelUtilsTest {
    public static void main(String[] args) {
        try {
            String filePath = "src/test/resources/testdata.xlsx";
            ExcelUtils excel = new ExcelUtils(filePath);

            // Read cell data
            String value = excel.getCellData("Sheet1", 0, 0);
            System.out.println("Read value: " + value);

            // Write cell data
            excel.setCellData("Sheet1", 1, 0, "Written Value");
            System.out.println("Written value to Sheet1, Row 1, Col 0");

            excel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
