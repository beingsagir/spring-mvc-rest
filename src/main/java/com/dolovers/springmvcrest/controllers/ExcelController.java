package com.dolovers.springmvcrest.controllers;


import com.dolovers.springmvcrest.services.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(ExcelController.BASE_URL)
public class ExcelController {
    public static final String BASE_URL = "/api/v1/excel";

    @Autowired
    ExcelService excelService;

    @GetMapping
    String getReport(){
        return excelService.generateDynamicExcel();
    }

    @GetMapping()
    String getReportById(){
        return excelService.generateDynamicExcel();
    }

}
