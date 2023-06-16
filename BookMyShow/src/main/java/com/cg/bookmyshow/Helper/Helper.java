package com.cg.bookmyshow.Helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.cg.bookmyshow.model.Data;

public class Helper {

    public static boolean checkExcelFormat(MultipartFile file){
        String contentType = file.getContentType();
        String excelContentType = "application/vnd.ms-excel";
        //application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
        if(contentType!=null && contentType.equals(excelContentType)){
            return true;
        }
        else{
            return false;
        }
    }

    //Store Excel Data to corresponding List

    public static List<Data> convertExcelToListOfProduct(InputStream is) {
        List<Data> list = new ArrayList<>(); 
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(is);

            XSSFSheet sheet = workbook.getSheet("movieData");

            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext()) {
                Row row = iterator.next();

                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cells = row.iterator();

                int cid = 0;

                Data d = new Data();

                while (cells.hasNext()) {
                    Cell cell = cells.next();

                    switch (cid) {
                        case 0:
                            d.setCityName(cell.getStringCellValue().toLowerCase()); 
                            break;
                        case 1:
                            d.setTheatreName(cell.getStringCellValue().toLowerCase());
                            break;
                        case 2:
                            d.setMovieName(cell.getStringCellValue().toLowerCase());
                            break;
                        case 3:
                            d.setActors(cell.getStringCellValue().toLowerCase());
                            break;
                        case 4:
                            d.setMovieRating(cell.getNumericCellValue());
                            break;
                        case 5:
                            d.setShowTimes(cell.getStringCellValue().toLowerCase());
                            break;
                        default:
                            break;
                    }
                    cid++;

                }

                list.add(d);


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    
    

    
}
