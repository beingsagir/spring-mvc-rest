package com.dolovers.springmvcrest.services;

import com.dolovers.springmvcrest.models.domainModel.ReportDM;
import com.dolovers.springmvcrest.utilities.ExcelGenerator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class ExcelServiceImpl implements ExcelService {


    @Override
    public String generateDynamicExcel() {
        String fileNameWithPath = "C:\\sandbox\\resources\\dummyFile.xlsx";
        String sheetName = "hello";
        ExcelGenerator.writeToExcelInMultiSheets(fileNameWithPath, sheetName, createADummyReport());
        return fileNameWithPath;
    }

    private List<ReportDM> createADummyReport() {
        List<ReportDM> reports = new ArrayList<>();
        ReportDM reportDM = new ReportDM();
        reportDM.setId(1);
        reportDM.setName("Hello");
        reportDM.setMessage("This is a dummy message");
        reportDM.setDate(new Date().toString());
        reports.add(reportDM);
        return reports;
    }
}
